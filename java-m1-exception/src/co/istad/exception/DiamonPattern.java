package co.istad.exception;

public class DiamonPattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        printDiamond(n);
    }

    public static void printDiamond(int n) {
        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("   "); // 3 spaces for alignment
            }

            // Print descending numbers from row to 1
            for (int num = row; num >= 1; num--) {
                System.out.print(num + " ");
            }

            // Print ascending numbers from 2 to row
            for (int num = 2; num <= row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
