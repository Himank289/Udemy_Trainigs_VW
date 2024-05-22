package lambdas;

import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        Predicate<Integer> pred=(Integer i)->{ return i%2==0;};
        Predicate<Integer> pred1=(Integer i)->{ return i%5==0;};

        System.out.println(pred.and(pred1).test(10));
        System.out.println(pred.or(pred1).test(10));
        System.out.println(pred.or(pred1).negate().test(10));


    }
}

