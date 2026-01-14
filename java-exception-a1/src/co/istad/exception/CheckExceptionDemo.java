package co.istad.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckExceptionDemo {
    public static void main(String[] args) {
        // Create path directory object
        Path path = Paths.get("src/co/istad/exception/data.txt");

        try {
            String record = Files.readString(path);
            System.out.println(record);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }
    }
}
