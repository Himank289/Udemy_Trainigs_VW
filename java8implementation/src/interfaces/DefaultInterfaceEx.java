package interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultInterfaceEx {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("Shiv","Himank","Sharma");
        lst.sort(Comparator.naturalOrder());
        lst.forEach(System.out::println);
    }
}
