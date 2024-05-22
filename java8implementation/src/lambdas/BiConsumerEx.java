package lambdas;

import java.util.function.BiConsumer;

public class BiConsumerEx {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biconmul=( a ,  b)->{
            System.out.println(a*b);

        };
        BiConsumer<Integer,Integer> bicondiv=(Integer a , Integer b)->{
            System.out.println(a/b);

        };
        BiConsumer<Integer,Integer> biconsub=(Integer a , Integer b)->{
            System.out.println(a-b);

        };
        BiConsumer<Integer,Integer> biconadd=(Integer a , Integer b)->{
            System.out.println(a+b);

        };
        biconmul.andThen(bicondiv).andThen(biconsub).andThen(biconadd).accept(8,2);
    }
}
