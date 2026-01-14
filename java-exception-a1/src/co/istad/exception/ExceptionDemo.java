package co.istad.exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        String[] names = {"Dara", "Tola", "Seyha"};
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number: ");
                int index = Integer.parseInt(scanner.nextLine());
                System.out.println("Index: " + index);
                System.out.println("Data: " + names[index]);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        } while (true);

    }
}
