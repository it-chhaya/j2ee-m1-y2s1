package co.istad.generictype;

public class BoxMain {
    public static void main(String[] args) {

        Box<Integer, String> box = new Box<>();

        box.setData(1);
        box.setSecondaryData("Banana");

        System.out.println(box.getData());
        System.out.println(box.getSecondaryData());
    }
}
