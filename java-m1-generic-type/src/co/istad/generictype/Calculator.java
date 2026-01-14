package co.istad.generictype;

// Upper Bound
public class Calculator <V1 extends Number, V2 extends Number>{
    private V1 value1;
    private V2 value2;

    public Calculator(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
