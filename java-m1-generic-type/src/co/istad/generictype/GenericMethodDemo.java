package co.istad.generictype;

public class GenericMethodDemo {

    public <T, S> void print(T data, S data2) {
        System.out.println("Data is " + data);
        System.out.println("Data 2 is " + data2);
    }

}
