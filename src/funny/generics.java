package funny;

public class generics {

    public static void main(String[] args) {
        System.out.println(add(2,2));
        System.out.println(add(2.56,2));
    }

    public static <T extends Number> float add(T x, T y) {
        float sum;
        sum = x.floatValue() + y.floatValue();
        return sum;
    }

}
