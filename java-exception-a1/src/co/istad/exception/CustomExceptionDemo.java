package co.istad.exception;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");
        Double score = Double.parseDouble(scanner.nextLine());

        // Validate score
        validateScore2(score);
        System.out.println("Score: " + score);
    }

    private static void validateScore(Double score) throws ScoreFormatException {
        if (score < 0 || score > 100)
            throw new ScoreFormatException("Score range is not valid!");
    }

    private static void validateScore2(Double score) {
        if (score < 0 || score > 100)
            throw new ScoreInvalidException("Score range is not valid!");
    }
}
