package lambdas;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<String> con=(s)->System.out.print(s.toUpperCase(Locale.ROOT));
        con.accept("this is himank");

    }

}
