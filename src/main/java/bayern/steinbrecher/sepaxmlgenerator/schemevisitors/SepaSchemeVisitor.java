package bayern.steinbrecher.sepaxmlgenerator.schemevisitors;

import bayern.steinbrecher.sepaxmlgenerator.sepatypes.SepaDocument;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.SepaNode;

import java.util.Objects;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public interface SepaSchemeVisitor {

    String getSchemeName();

    default String getXsdFilePath() {
        return Objects.requireNonNull(
                getClass().getResource(getSchemeName() + ".xsd"),
                "The XSD scheme for " + getSchemeName() + " was not found"
        ).toExternalForm();
    }

    // Generation

    default String visitGenerate(SepaNode node){
        throw new UnsupportedOperationException(
                String.format("The sepa visitor %s does not supported visiting nodes of type %s for generation",
                        getClass().getName(), node.getClass().getName()));
    }

    default String visitGenerate(SepaDocument node){
        return visitGenerate((SepaNode) node);
    }

    // Verification

    default boolean visitVerify(SepaNode node){
        throw new UnsupportedOperationException(
                String.format("The sepa visitor %s does not supported visiting nodes of type %s for verification",
                        getClass().getName(), node.getClass().getName()));
    }

    default boolean visitVerify(SepaDocument node){
        return visitVerify((SepaNode) node);
    }
}
