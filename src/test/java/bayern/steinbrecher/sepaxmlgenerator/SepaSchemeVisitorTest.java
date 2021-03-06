package bayern.steinbrecher.sepaxmlgenerator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@Test
public class SepaSchemeVisitorTest {

    private static final Iterable<SepaGenerator> GENERATORS = List.of(
            SepaGenerator.getGenerator(SepaVersion.PAIN_008_001_02),
            SepaGenerator.getGenerator(SepaVersion.PAIN_008_001_09)
    );

    @Test
    public void generateSingleTransactionSepa() throws GenerationFailedException, IOException {
        GregorianCalendar executionDate = new GregorianCalendar();
        executionDate.add(Calendar.WEEK_OF_YEAR, 1);

        SepaDocumentDescription sepaDocumentDescription = new SepaDocumentDescription(
                new MessageId("msgId"),
                new Creditor(
                        "JM-0815",
                        new AccountHolder("Joe", "Moneymaker",
                                new IBAN("DE91100000000123456789"),
                                new BIC("MARKDEF1180")),
                        new CreditorId("DE98ZZZ09999999999")
                ),
                List.of(
                        new DirectDebitTransaction(
                                new DirectDebitMandate("personA",
                                        new AccountHolder("Mary", "Jason",
                                                new IBAN("DE89370400440532013000"),
                                                new BIC("COBADEFFXXX")),
                                        LocalDate.of(2010, 05, 13)),
                                "Your bill",
                                42.42
                        ),
                        new DirectDebitTransaction(
                                new DirectDebitMandate("personB",
                                        new AccountHolder("Jimmy", "James",
                                                new IBAN("DE27100777770209299700"),
                                                new BIC("DEUTDE2H264")),
                                        LocalDate.of(2000, 1, 1)),
                                "Another bill",
                                13.37
                        )
                ),
                executionDate);
        Assert.assertTrue(SepaGenerator.validateDescription(sepaDocumentDescription));

        for(SepaGenerator generator : GENERATORS) {
            String generatedXML = generator.generateXML(sepaDocumentDescription);
            System.out.println("generatedXML =\n" + generatedXML);
            System.out.println("Validating...");
            Assert.assertTrue(generator.validateXML(generatedXML));
        }
    }
}
