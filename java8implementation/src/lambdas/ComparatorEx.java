package lambdas;

import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {

  Comparator <Integer> cmp=new Comparator<Integer>(){


      @Override
      public int compare(Integer o1, Integer o2) {
          return o1.compareTo(o2);
      }
  };
  System.out.println("result of comparator is"+cmp.compare(3,7));
  Comparator <Integer>cmplambda=(Integer a,Integer b)->  a.compareTo(b);
  System.out.println(cmplambda.compare(2,1));

    }


}
