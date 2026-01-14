package co.istad.exception;

public class DemoThrowKeyword {
    public static void main(String[] args) {
        int result = divide(12, 10);
        System.out.println("Result: " + result);

        try {
            int result2 = divide2(12,10);
            System.out.println("Result2: " + result2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("B cannot be zero");
        return a / b;
    }

    private static int divide2(int a, int b) throws Exception {
        if (b == 0)
            throw new Exception("B cannot be zero");
        return a / b;
    }
}
