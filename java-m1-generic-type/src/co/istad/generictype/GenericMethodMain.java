package co.istad.generictype;

public class GenericMethodMain {
    public static void main(String[] args) {
        GenericMethodDemo demo = new GenericMethodDemo();
        demo.print(12.3, 12.3);
        demo.print("Coffee", true);
        demo.print(true, "Test");
    }
}
