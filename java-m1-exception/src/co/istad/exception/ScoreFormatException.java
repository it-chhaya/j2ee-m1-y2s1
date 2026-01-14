package co.istad.exception;

// Create exception class
public class ScoreFormatException extends Exception {
    // Activate exception
    public ScoreFormatException() {
        super(); // Important
    }

    public ScoreFormatException(String message) {
        super(message);
    }
}