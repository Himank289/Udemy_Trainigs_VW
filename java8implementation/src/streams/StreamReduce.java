package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);

        lst.forEach(System.out::println);
      int sum=  lst.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

       Optional<Integer> sum2= lst.stream().reduce(Integer::sum);
       if(sum2.isPresent()){
           System.out.println(sum2);
       }
        int max=  lst.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(max);

    }
}
