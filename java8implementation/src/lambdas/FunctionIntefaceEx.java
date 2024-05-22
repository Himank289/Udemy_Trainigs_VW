package lambdas;

import java.util.function.Function;

public class FunctionIntefaceEx {
    public static void main(String[] args) {
        Function<Integer,Integer> func=(i)->i/2;
        System.out.println(func.apply(4));

        Function<Integer,Integer> func1=(i)->i*10;
        System.out.println(func.andThen(func1).apply(4));
        System.out.println(func.compose(func1).apply(4));
    }
}
