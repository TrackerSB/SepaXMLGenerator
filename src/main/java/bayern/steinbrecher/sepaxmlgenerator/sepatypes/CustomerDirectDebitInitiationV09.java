package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record CustomerDirectDebitInitiationV09(
        GroupHeader83 grpHdr,
        Optional<PaymentInstruction37> pmtInf,
        Optional<SupllementaryData1> splmtryData) implements SepaNode {
}
