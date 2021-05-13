package bayern.steinbrecher.sepaxmlgenerator;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public class GenerationFailedException extends Exception {
    public GenerationFailedException() {
    }

    public GenerationFailedException(String message) {
        super(message);
    }

    public GenerationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenerationFailedException(Throwable cause) {
        super(cause);
    }
}
