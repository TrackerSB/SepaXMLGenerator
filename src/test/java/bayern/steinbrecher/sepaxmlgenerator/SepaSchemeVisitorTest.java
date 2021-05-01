package bayern.steinbrecher.sepaxmlgenerator;

import org.testng.annotations.Test;

import java.util.List;

@Test
public class SepaSchemeVisitorTest {
    @Test
    public void generateSingleTransactionSepa() {
        SepaDocumentDescription sepaDocumentDescription = new SepaDocumentDescription(
                new Creditor(
                        new CreditorId("DE98ZZZ09999999999"),
                        new AccountHolder("Joe", "Moneymaker",
                                new IBAN("DE91100000000123456789"),
                                new BIC("MARKDEF1180"))
                ),
                List.of(
                        new DirectDebitTransaction(
                                new DirectDebitMandate("personA",
                                        new AccountHolder("Mary", "Jason",
                                                new IBAN("DE89370400440532013000"),
                                                new BIC("COBADEFFXXX"))),
                                "Your bill",
                                42.42
                        ),
                        new DirectDebitTransaction(
                                new DirectDebitMandate("personB",
                                        new AccountHolder("Jimmy", "James",
                                                new IBAN("DE27100777770209299700 "),
                                                new BIC("DEUTDE2H264"))),
                                "Another bill",
                                13.37
                        )
                ));
        String generatedXML = SepaGenerator.generateXML(SepaVersion.PAIN_008_001_09, sepaDocumentDescription);
        System.out.println("generatedXML = " + generatedXML);
    }
}
