package co.istad.exception;

public class DemoThrowException {
    public static void main(String[] args) throws Exception {
        try {
            double result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        double result = divide2(10, 0);
        System.out.println("Result2: " + result);
    }

    private static double divide(double x, double y) {
        if (y == 0)
            throw new IllegalArgumentException("Divide by zero is not allowed");
        return x / y;
    }

    private static double divide2(double x, double y) throws Exception {
        if (y == 0)
            throw new Exception("Divide by zero is not allowed");
        return x / y;
    }
}
