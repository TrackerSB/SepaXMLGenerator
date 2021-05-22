package bayern.steinbrecher.sepaxmlgenerator;

/**
 * Records implementing this interface allow a validation of their contents before generating any XML output. The
 * validations serve at least one of the following purposes.
 * <ol>
 *     <li>Determine which data is invalid beforehand</li>
 *     <li>Provide more precise and user friendly reports than XSD validation reports</li>
 *     <li>
 *         Add further validity constraints that cannot be checked by XSD including:
 *         <ul>
 *             <li>Legal conditions</li>
 *             <li>IBAN checksums</li>
 *             <li>Duplication</li>
 *         </ul>
 *     </li>
 * </ol>
 *
 * @author Stefan Huber
 * @since 0.1
 */
public interface Validatable {
    boolean isValid();
}
