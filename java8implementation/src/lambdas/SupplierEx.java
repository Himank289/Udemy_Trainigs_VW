package lambdas;

import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {

        Supplier<Double> show=()->Math.random();
        System.out.println(show.get());
    }
}
