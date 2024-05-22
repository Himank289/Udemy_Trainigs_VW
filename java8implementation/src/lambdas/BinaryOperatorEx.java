package lambdas;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorEx {
    public static void main(String[] args) {
        BinaryOperator<Integer> bi=(a,b)->a*b;
        System.out.println(bi.apply(3,4));

        Comparator<Integer> cmp=(a,b)->a.compareTo(b);
        BinaryOperator<Integer> bimax=BinaryOperator.maxBy(cmp);
        System.out.println(bimax.apply(4,9));

        BinaryOperator<Integer> bimin=BinaryOperator.minBy(cmp);
        System.out.println(bimin.apply(4,9));

    }
}
