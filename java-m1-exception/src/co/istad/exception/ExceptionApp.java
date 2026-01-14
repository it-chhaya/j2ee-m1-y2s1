package co.istad.exception;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter menu option: ");
            int op = Integer.parseInt(scanner.nextLine());

            Path path;

            switch (op) {
                case 1 -> path = Paths.get("src/co/istad/exception/data.txt");
                case 2 -> path = Paths.get("src/co/istad/exception/data2.txt");
                default -> throw new IllegalStateException("Invalid menu option!");
            }

            String data = Files.readString(path);

            if (data.equals("Telegram")) {
                return;
            }
            if (data.equals("Facebook")){
                System.out.println("Data is " + data);
            }
        } catch (IOException | NumberFormatException | IllegalStateException e) {
            System.out.println(e.getClass().getSimpleName() + ":"
                    + e.getMessage());

        } finally {
            System.out.println("I am finally block");
        }
    }
}
