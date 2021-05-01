package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record BranchAndFinancialInstitutionIdentification6(
        FinancialInstitutionIdentification18 finInstnId,
        Optional<BranchData3> brnchId) implements SepaNode {
}
