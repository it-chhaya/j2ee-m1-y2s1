package co.istad.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoTryWithResource {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(
                new FileReader("src/co/istad/exception/data.txt")
        )) {
            br.lines().forEach(line -> System.out.println(line));
        } catch (IOException e) {
            System.out.println(
                    "File not found: " + e.getMessage()
            );
        }
    }
}
