package bayern.steinbrecher.sepaxmlgenerator.generators;

import bayern.steinbrecher.sepaxmlgenerator.DirectDebitTransaction;
import bayern.steinbrecher.sepaxmlgenerator.GenerationFailedException;
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
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.GroupHeader83;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.PartyIdentification135;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.PaymentIdentification6;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.PaymentInstruction37;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.PaymentMethod2Code;

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

    static {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public SepaPain00800109Generator() {
        super("pain.008.001.09.xsd");
    }

    @Override
    public String generateXML(SepaDocumentDescription sepaDocumentDescription) throws GenerationFailedException {
        Document document = new Document();
        {
            CustomerDirectDebitInitiationV09 cstmrDrctDbtInitn = new CustomerDirectDebitInitiationV09();
            {
                GroupHeader83 grpHdr = new GroupHeader83();
                grpHdr.setCreDtTm(datatypeFactory.newXMLGregorianCalendar(new GregorianCalendar()));
                grpHdr.setMsgId(sepaDocumentDescription.msgId());
                grpHdr.setNbOfTxs(String.valueOf(sepaDocumentDescription.transactions().size()));
                // grpHdr.setCtrlSum(
                //         BigDecimal.valueOf(
                //                 sepaDocumentDescription.transactions()
                //                         .stream()
                //                         .mapToDouble(DirectDebitTransaction::amount)
                //                         .sum()));
                {
                    PartyIdentification135 initgPty = new PartyIdentification135();
                    grpHdr.setInitgPty(initgPty);
                }
                cstmrDrctDbtInitn.setGrpHdr(grpHdr);
            }
            {
                PaymentInstruction37 pmtInf = new PaymentInstruction37();
                pmtInf.setPmtInfId(sepaDocumentDescription.collectorId());
                pmtInf.setPmtMtd(PaymentMethod2Code.DD);
                pmtInf.setBtchBookg(true);
                pmtInf.setReqdColltnDt(
                        datatypeFactory.newXMLGregorianCalendar(
                                sepaDocumentDescription.executionDate()));
                {
                    PartyIdentification135 cdtr = new PartyIdentification135();
                    pmtInf.setCdtr(cdtr);
                }
                {
                    CashAccount38 cdtrAcct = new CashAccount38();
                    {
                        AccountIdentification4Choice id = new AccountIdentification4Choice();
                        id.setIBAN(sepaDocumentDescription.creditor().accountHolder().iban().value());
                        cdtrAcct.setId(id);
                    }
                    pmtInf.setCdtrAcct(cdtrAcct);
                }
                {
                    BranchAndFinancialInstitutionIdentification6 cdtrAgt
                            = new BranchAndFinancialInstitutionIdentification6();
                    {
                        FinancialInstitutionIdentification18 finInstnId = new FinancialInstitutionIdentification18();
                        cdtrAgt.setFinInstnId(finInstnId);
                    }
                    pmtInf.setCdtrAgt(cdtrAgt);
                }
                for (DirectDebitTransaction transaction : sepaDocumentDescription.transactions()) {
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
                        BranchAndFinancialInstitutionIdentification6 dbtrAgt
                                = new BranchAndFinancialInstitutionIdentification6();
                        {
                            FinancialInstitutionIdentification18 finInstnId = new FinancialInstitutionIdentification18();
                            dbtrAgt.setFinInstnId(finInstnId);
                        }
                        transactionInfo.setDbtrAgt(dbtrAgt);
                    }
                    {
                        PartyIdentification135 dbtr = new PartyIdentification135();
                        transactionInfo.setDbtr(dbtr);
                    }
                    {
                        CashAccount38 dbtrAcct = new CashAccount38();
                        {
                            AccountIdentification4Choice id = new AccountIdentification4Choice();
                            id.setIBAN(transaction.mandate().accountHolder().iban().value());
                            dbtrAcct.setId(id);
                        }
                        transactionInfo.setDbtrAcct(dbtrAcct);
                    }
                    pmtInf.getDrctDbtTxInf()
                            .add(transactionInfo);
                }
                cstmrDrctDbtInitn.getPmtInf()
                        .add(pmtInf);
            }
            document.setCstmrDrctDbtInitn(cstmrDrctDbtInitn);
        }

        return generateXML(document);
    }
}
