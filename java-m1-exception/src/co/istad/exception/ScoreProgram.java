package co.istad.exception;

import java.util.Scanner;

public class ScoreProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter score: ");
                double score = Double.parseDouble(scanner.nextLine());
                validateScore(score);
                System.out.println("Score: " + score);
            } catch (ScoreFormatException e) {
                System.out.println("SCORE_FORMAT:" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("NUM_FORMAT:" + e.getMessage());
            }
        } while (true);
    }

    private static void validateScore(double score) throws
            ScoreFormatException {

        if (score < 0 || score > 100)
            throw new ScoreFormatException("Score is invalid..!");

    }


}
