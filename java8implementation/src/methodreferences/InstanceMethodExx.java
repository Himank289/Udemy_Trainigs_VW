package methodreferences;

import java.util.Locale;
import java.util.function.Function;

public class InstanceMethodExx {
        public static void main(String[] args) {
                Function<String,String> f=(s)->s.toUpperCase(Locale.ROOT);
                Function<String,String> f1=String::toUpperCase;

                System.out.println(f.apply("Java"));
                System.out.println(f1.apply("Java"));

        }
}

