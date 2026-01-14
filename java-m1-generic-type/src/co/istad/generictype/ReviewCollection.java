package co.istad.generictype;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReviewCollection {
    public static void main(String[] args) {

        // Compiler will determine
        List<Double> list = new ArrayList<>();
        list.add(12.3);
        //list.add("Hello");

        Double sum = list.get(0) + 10;
        System.out.println(sum);


    }
}
