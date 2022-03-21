package bayern.steinbrecher.sepaxmlgenerator.generators;

import bayern.steinbrecher.sepaxmlgenerator.DirectDebitTransaction;
import bayern.steinbrecher.sepaxmlgenerator.GenerationFailedException;
import bayern.steinbrecher.sepaxmlgenerator.IBAN;
import bayern.steinbrecher.sepaxmlgenerator.SepaDocumentDescription;
import bayern.steinbrecher.sepaxmlgenerator.SepaGenerator;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800102.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public class SepaPain00800102Generator extends SepaGenerator {
    private static final DatatypeFactory datatypeFactory;
    private static final BranchAndFinancialInstitutionIdentification4 NOT_PROVIDED_BANK
            = new BranchAndFinancialInstitutionIdentification4();

    static {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException ex) {
            throw new ExceptionInInitializerError(ex);
        }

        FinancialInstitutionIdentification7 finInstnId = new FinancialInstitutionIdentification7();
        {
            GenericFinancialIdentification1 othr = new GenericFinancialIdentification1();
            othr.setId("NOTPROVIDED");
            finInstnId.setOthr(othr);
        }
        NOT_PROVIDED_BANK.setFinInstnId(finInstnId);
    }

    public SepaPain00800102Generator() {
        super("pain.008.001.02.xsd");
    }

    @Override
    protected Class<?> getDocumentType() {
        return Document.class;
    }

    private CashAccount16 convert(IBAN iban) {
        CashAccount16 cashAccount = new CashAccount16();
        AccountIdentification4Choice id = new AccountIdentification4Choice();
        id.setIBAN(iban.value());
        cashAccount.setId(id);
        return cashAccount;
    }

    private DirectDebitTransactionInformation9 convert(DirectDebitTransaction transaction) {
        DirectDebitTransactionInformation9 transactionInfo = new DirectDebitTransactionInformation9();
        {
            PaymentIdentification1 pmtId = new PaymentIdentification1();
            pmtId.setEndToEndId("NOTPROVIDED");
            transactionInfo.setPmtId(pmtId);
        }
        {
            ActiveOrHistoricCurrencyAndAmount instdAmt = new ActiveOrHistoricCurrencyAndAmount();
            instdAmt.setCcy("EUR");
            instdAmt.setValue(BigDecimal.valueOf(transaction.amount()));
            transactionInfo.setInstdAmt(instdAmt);
        }
        {
            var drctDbtTx = new DirectDebitTransaction6();
            {
                var mndtRltdInf = new MandateRelatedInformation6();
                mndtRltdInf.setMndtId(transaction.mandate().id());
                mndtRltdInf.setDtOfSgntr(datatypeFactory.newXMLGregorianCalendar(
                        transaction.mandate().signed().toString()));
                drctDbtTx.setMndtRltdInf(mndtRltdInf);
            }
            transactionInfo.setDrctDbtTx(drctDbtTx);
        }
        transactionInfo.setDbtrAgt(NOT_PROVIDED_BANK);
        {
            PartyIdentification32 dbtr = new PartyIdentification32();
            dbtr.setNm(transaction.mandate().owner().name());
            transactionInfo.setDbtr(dbtr);
        }
        transactionInfo.setDbtrAcct(convert(transaction.mandate().owner().iban()));
        {
            RemittanceInformation5 rmtInf = new RemittanceInformation5();
            rmtInf.getUstrd()
                    .add(transaction.purpose());
            transactionInfo.setRmtInf(rmtInf);
        }

        return transactionInfo;
    }

    @Override
    protected String generateXMLImpl(SepaDocumentDescription sepaDocumentDescription) throws GenerationFailedException {
        Document document = new Document();
        {
            CustomerDirectDebitInitiationV02 cstmrDrctDbtInitn = new CustomerDirectDebitInitiationV02();
            {
                GroupHeader39 grpHdr = new GroupHeader39();
                grpHdr.setCreDtTm(datatypeFactory.newXMLGregorianCalendar(new GregorianCalendar()));
                grpHdr.setMsgId(sepaDocumentDescription.msgId().value());
                grpHdr.setNbOfTxs(String.valueOf(sepaDocumentDescription.transactions().size()));
                {
                    PartyIdentification32 initgPty = new PartyIdentification32();
                    grpHdr.setInitgPty(initgPty);
                }
                cstmrDrctDbtInitn.setGrpHdr(grpHdr);
            }
            {
                PaymentInstructionInformation4 pmtInf = new PaymentInstructionInformation4();
                pmtInf.setPmtInfId(sepaDocumentDescription.creditor().collectorId());
                pmtInf.setPmtMtd(PaymentMethod2Code.DD);
                pmtInf.setBtchBookg(true);
                {
                    var pmtTpInf = new PaymentTypeInformation20();
                    {
                        var svcLvl = new ServiceLevel8Choice();
                        svcLvl.setCd("SEPA");
                        pmtTpInf.setSvcLvl(svcLvl);
                    }
                    {
                        var lclInstrm = new LocalInstrument2Choice();
                        lclInstrm.setCd("CORE");
                        pmtTpInf.setLclInstrm(lclInstrm);
                    }
                    pmtTpInf.setSeqTp(SequenceType1Code.RCUR);
                    pmtInf.setPmtTpInf(pmtTpInf);
                }
                pmtInf.setReqdColltnDt(
                        datatypeFactory.newXMLGregorianCalendar(
                                sepaDocumentDescription.executionDate()));
                {
                    PartyIdentification32 cdtr = new PartyIdentification32();
                    cdtr.setNm(sepaDocumentDescription.creditor().collector().name());
                    pmtInf.setCdtr(cdtr);
                }
                pmtInf.setCdtrAcct(convert(sepaDocumentDescription.creditor().collector().iban()));
                pmtInf.setCdtrAgt(NOT_PROVIDED_BANK);

                for (DirectDebitTransaction transaction : sepaDocumentDescription.transactions()) {
                    pmtInf.getDrctDbtTxInf()
                            .add(convert(transaction));
                }
                cstmrDrctDbtInitn.getPmtInf()
                        .add(pmtInf);
            }
            document.setCstmrDrctDbtInitn(cstmrDrctDbtInitn);
        }

        return generateXML(document);
    }
}
