package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import bayern.steinbrecher.sepaxmlgenerator.schemevisitors.SepaSchemeVisitor;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public interface SepaNode {
    default void acceptGenerate(SepaSchemeVisitor visitor){
        visitor.visitGenerate(this);
    }

    default void acceptVerify(SepaSchemeVisitor visitor){
        visitor.visitVerify(this);
    }
}
