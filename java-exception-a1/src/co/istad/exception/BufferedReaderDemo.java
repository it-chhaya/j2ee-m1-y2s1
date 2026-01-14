package co.istad.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/co/istad/exception/data.txt");
             BufferedReader br = new BufferedReader(fr)) {

            //System.out.println(br);
            br.lines().forEach(line -> System.out.println("BR: " + line));

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        }
    }
}
