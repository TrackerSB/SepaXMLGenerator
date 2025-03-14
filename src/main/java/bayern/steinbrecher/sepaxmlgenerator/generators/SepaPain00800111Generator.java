package bayern.steinbrecher.sepaxmlgenerator.generators;

import bayern.steinbrecher.sepaxmlgenerator.DirectDebitTransaction;
import bayern.steinbrecher.sepaxmlgenerator.GenerationFailedException;
import bayern.steinbrecher.sepaxmlgenerator.IBAN;
import bayern.steinbrecher.sepaxmlgenerator.SepaDocumentDescription;
import bayern.steinbrecher.sepaxmlgenerator.SepaGenerator;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.AccountIdentification4Choice;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.ActiveOrHistoricCurrencyAndAmount;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.BranchAndFinancialInstitutionIdentification8;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.CashAccount40;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.CustomerDirectDebitInitiationV11;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.DirectDebitTransaction12;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.DirectDebitTransactionInformation32;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.Document;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.FinancialInstitutionIdentification23;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.GenericFinancialIdentification1;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.GenericPersonIdentification2;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.GroupHeader118;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.LocalInstrument2Choice;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.MandateRelatedInformation16;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.Party52Choice;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.PartyIdentification272;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.PaymentIdentification6;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.PaymentInstruction45;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.PaymentMethod2Code;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.PaymentTypeInformation29;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.PersonIdentification18;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.PersonIdentificationSchemeName1Choice;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.RemittanceInformation22;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111.SequenceType3Code;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public class SepaPain00800111Generator extends SepaGenerator {
    private static final DatatypeFactory datatypeFactory;
    private static final BranchAndFinancialInstitutionIdentification8 NOT_PROVIDED_BANK
            = new BranchAndFinancialInstitutionIdentification8();

    static {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException ex) {
            throw new ExceptionInInitializerError(ex);
        }

        FinancialInstitutionIdentification23 finInstnId = new FinancialInstitutionIdentification23();
        {
            GenericFinancialIdentification1 othr = new GenericFinancialIdentification1();
            othr.setId("NOTPROVIDED");
            finInstnId.setOthr(othr);
        }
        NOT_PROVIDED_BANK.setFinInstnId(finInstnId);
    }

    public SepaPain00800111Generator() {
        super("pain.008.001.11.xsd");
    }

    @Override
    protected Class<?> getDocumentType() {
        return Document.class;
    }

    private CashAccount40 convert(IBAN iban) {
        CashAccount40 cashAccount = new CashAccount40();
        AccountIdentification4Choice id = new AccountIdentification4Choice();
        id.setIBAN(iban.value());
        cashAccount.setId(id);
        return cashAccount;
    }

    private DirectDebitTransactionInformation32 convert(DirectDebitTransaction transaction) {
        DirectDebitTransactionInformation32 transactionInfo = new DirectDebitTransactionInformation32();
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
            var drctDbtTx = new DirectDebitTransaction12();
            {
                var mndtRltdInf = new MandateRelatedInformation16();
                mndtRltdInf.setMndtId(transaction.mandate().id());
                mndtRltdInf.setDtOfSgntr(datatypeFactory.newXMLGregorianCalendar(
                        transaction.mandate().signed().toString()));
                drctDbtTx.setMndtRltdInf(mndtRltdInf);
            }
            transactionInfo.setDrctDbtTx(drctDbtTx);
        }
        transactionInfo.setDbtrAgt(NOT_PROVIDED_BANK);
        {
            PartyIdentification272 dbtr = new PartyIdentification272();
            dbtr.setNm(transaction.mandate().owner().name());
            transactionInfo.setDbtr(dbtr);
        }
        transactionInfo.setDbtrAcct(convert(transaction.mandate().owner().iban()));
        {
            RemittanceInformation22 rmtInf = new RemittanceInformation22();
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
            CustomerDirectDebitInitiationV11 cstmrDrctDbtInitn = new CustomerDirectDebitInitiationV11();
            {
                GroupHeader118 grpHdr = new GroupHeader118();
                grpHdr.setCreDtTm(datatypeFactory.newXMLGregorianCalendar(new GregorianCalendar()));
                grpHdr.setMsgId(sepaDocumentDescription.msgId().value());
                grpHdr.setNbOfTxs(String.valueOf(sepaDocumentDescription.transactions().size()));
                grpHdr.setCtrlSum(BigDecimal.valueOf(
                        sepaDocumentDescription.transactions()
                                .stream()
                                .mapToDouble(DirectDebitTransaction::amount)
                                .sum()));
                {
                    PartyIdentification272 initgPty = new PartyIdentification272();
                    grpHdr.setInitgPty(initgPty);
                }
                cstmrDrctDbtInitn.setGrpHdr(grpHdr);
            }
            {
                PaymentInstruction45 pmtInf = new PaymentInstruction45();
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
                    PartyIdentification272 cdtr = new PartyIdentification272();
                    cdtr.setNm(sepaDocumentDescription.creditor().collector().name());
                    pmtInf.setCdtr(cdtr);
                }
                pmtInf.setCdtrAcct(convert(sepaDocumentDescription.creditor().collector().iban()));
                pmtInf.setCdtrAgt(NOT_PROVIDED_BANK);
                {
                    var cdtrSchmeId = new PartyIdentification272();
                    {
                        var id = new Party52Choice();
                        {
                            var prvtId = new PersonIdentification18();
                            {
                                var creditorId = new GenericPersonIdentification2();
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
