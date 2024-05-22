package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
    public static void main(String[] args) {
        UnaryOperator<String> st=(s)->s.toUpperCase();
        System.out.println(st.apply("Java8"));
    }
}
