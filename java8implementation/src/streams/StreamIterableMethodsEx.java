package streams;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamIterableMethodsEx {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("Himank", "Rohit", "Rama", "In a Team");
        str.forEach(System.out::println);

        Stream.iterate(1,x->x+10).limit(10).forEach(System.out::println);
        Supplier<Double> sup=()->Math.random();
        Stream.generate(sup).limit(10).forEach(System.out::println);
    }
}
