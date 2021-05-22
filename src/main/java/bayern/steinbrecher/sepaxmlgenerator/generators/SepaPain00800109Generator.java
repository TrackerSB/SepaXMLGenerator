package bayern.steinbrecher.sepaxmlgenerator.generators;

import bayern.steinbrecher.sepaxmlgenerator.DirectDebitTransaction;
import bayern.steinbrecher.sepaxmlgenerator.GenerationFailedException;
import bayern.steinbrecher.sepaxmlgenerator.IBAN;
import bayern.steinbrecher.sepaxmlgenerator.SepaDocumentDescription;
import bayern.steinbrecher.sepaxmlgenerator.SepaGenerator;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.AccountIdentification4Choice;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.ActiveOrHistoricCurrencyAndAmount;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.BranchAndFinancialInstitutionIdentification6;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.CashAccount38;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.CustomerDirectDebitInitiationV09;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.DirectDebitTransactionInformation23;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.Document;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.FinancialInstitutionIdentification18;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.GenericFinancialIdentification1;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.GroupHeader83;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.PartyIdentification135;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.PaymentIdentification6;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.PaymentInstruction37;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.PaymentMethod2Code;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.RemittanceInformation16;

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
        transactionInfo.setDbtrAgt(NOT_PROVIDED_BANK);
        {
            PartyIdentification135 dbtr = new PartyIdentification135();
            dbtr.setNm(transaction.mandate().accountHolder().name());
            transactionInfo.setDbtr(dbtr);
        }
        transactionInfo.setDbtrAcct(convert(transaction.mandate().accountHolder().iban()));
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
