package bayern.steinbrecher.sepaxmlgenerator.generators;

import bayern.steinbrecher.sepaxmlgenerator.DirectDebitTransaction;
import bayern.steinbrecher.sepaxmlgenerator.GenerationFailedException;
import bayern.steinbrecher.sepaxmlgenerator.IBAN;
import bayern.steinbrecher.sepaxmlgenerator.SepaDocumentDescription;
import bayern.steinbrecher.sepaxmlgenerator.SepaGenerator;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public class SepaPain00800109Generator extends SepaGenerator {
    private static final DatatypeFactory datatypeFactory;
    private static final BranchAndFinancialInstitutionIdentification6 NOT_PROVIDED_BANK
            = new BranchAndFinancialInstitutionIdentification6();

    static {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException ex) {
            throw new ExceptionInInitializerError(ex);
        }

        FinancialInstitutionIdentification18 finInstnId = new FinancialInstitutionIdentification18();
        {
            GenericFinancialIdentification1 othr = new GenericFinancialIdentification1();
            othr.setId("NOTPROVIDED");
            finInstnId.setOthr(othr);
        }
        NOT_PROVIDED_BANK.setFinInstnId(finInstnId);
    }

    public SepaPain00800109Generator() {
        super("pain.008.001.09.xsd");
    }

    @Override
    protected Class<?> getDocumentType() {
        return Document.class;
    }

    private CashAccount38 convert(IBAN iban) {
        CashAccount38 cashAccount = new CashAccount38();
        AccountIdentification4Choice id = new AccountIdentification4Choice();
        id.setIBAN(iban.value());
        cashAccount.setId(id);
        return cashAccount;
    }

    private DirectDebitTransactionInformation23 convert(DirectDebitTransaction transaction) {
        DirectDebitTransactionInformation23 transactionInfo = new DirectDebitTransactionInformation23();
        {
            PaymentIdentification6 pmtId = new PaymentIdentification6();
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
            var drctDbtTx = new DirectDebitTransaction10();
            {
                var mndtRltdInf = new MandateRelatedInformation14();
                mndtRltdInf.setMndtId(transaction.mandate().id());
                mndtRltdInf.setDtOfSgntr(datatypeFactory.newXMLGregorianCalendar(
                        transaction.mandate().signed().toString()));
                drctDbtTx.setMndtRltdInf(mndtRltdInf);
            }
            transactionInfo.setDrctDbtTx(drctDbtTx);
        }
        transactionInfo.setDbtrAgt(NOT_PROVIDED_BANK);
        {
            PartyIdentification135 dbtr = new PartyIdentification135();
            dbtr.setNm(transaction.mandate().owner().name());
            transactionInfo.setDbtr(dbtr);
        }
        transactionInfo.setDbtrAcct(convert(transaction.mandate().owner().iban()));
        {
            RemittanceInformation16 rmtInf = new RemittanceInformation16();
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
            CustomerDirectDebitInitiationV09 cstmrDrctDbtInitn = new CustomerDirectDebitInitiationV09();
            {
                GroupHeader83 grpHdr = new GroupHeader83();
                grpHdr.setCreDtTm(datatypeFactory.newXMLGregorianCalendar(new GregorianCalendar()));
                grpHdr.setMsgId(sepaDocumentDescription.msgId().value());
                grpHdr.setNbOfTxs(String.valueOf(sepaDocumentDescription.transactions().size()));
                grpHdr.setCtrlSum(BigDecimal.valueOf(
                        sepaDocumentDescription.transactions()
                                .stream()
                                .mapToDouble(DirectDebitTransaction::amount)
                                .sum()));
                {
                    PartyIdentification135 initgPty = new PartyIdentification135();
                    grpHdr.setInitgPty(initgPty);
                }
                cstmrDrctDbtInitn.setGrpHdr(grpHdr);
            }
            {
                PaymentInstruction37 pmtInf = new PaymentInstruction37();
                pmtInf.setPmtInfId(sepaDocumentDescription.creditor().collectorId());
                pmtInf.setPmtMtd(PaymentMethod2Code.DD);
                pmtInf.setBtchBookg(true);
                {
                    var pmtTpInf = new PaymentTypeInformation29();
                    {
                        var lclInstrm = new LocalInstrument2Choice();
                        lclInstrm.setCd("CORE");
                        pmtTpInf.setLclInstrm(lclInstrm);
                    }
                    pmtTpInf.setSeqTp(SequenceType3Code.RCUR);
                    pmtInf.setPmtTpInf(pmtTpInf);
                }
                pmtInf.setReqdColltnDt(
                        datatypeFactory.newXMLGregorianCalendar(
                                sepaDocumentDescription.executionDate()));
                {
                    PartyIdentification135 cdtr = new PartyIdentification135();
                    cdtr.setNm(sepaDocumentDescription.creditor().collector().name());
                    pmtInf.setCdtr(cdtr);
                }
                pmtInf.setCdtrAcct(convert(sepaDocumentDescription.creditor().collector().iban()));
                pmtInf.setCdtrAgt(NOT_PROVIDED_BANK);
                {
                    var cdtrSchmeId = new PartyIdentification135();
                    {
                        var id = new Party38Choice();
                        {
                            var prvtId = new PersonIdentification13();
                            {
                                var creditorId = new GenericPersonIdentification1();
                                creditorId.setId(sepaDocumentDescription.creditor().creditorId().value());
                                {
                                    var schmeNm = new PersonIdentificationSchemeName1Choice();
                                    schmeNm.setPrtry("SEPA");
                                    creditorId.setSchmeNm(schmeNm);
                                }
                                prvtId.getOthr()
                                        .add(creditorId);
                            }
                            id.setPrvtId(prvtId);
                        }
                        cdtrSchmeId.setId(id);
                    }
                    pmtInf.setCdtrSchmeId(cdtrSchmeId);
                }

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
