package co.istad.exception;

// Create Exception Class (Compile-time or checked_
public class ScoreFormatException extends Exception {
    // Activate Exception Feature
    public ScoreFormatException() {
        // Start Activate
        super();
    }

    public ScoreFormatException(String message) {
        super(message);
    }
}
