package interfaces;

import java.util.Arrays;
import java.util.List;

public class MulitiplierEx implements Multiplier{
    public static void main(String[] args) {
        MulitiplierEx mul=new MulitiplierEx();
        List<Integer> lst= Arrays.asList(1,2,3,4,5,6);
        System.out.println(mul.multiply(lst));

    }

    @Override
    public int multiply(List<Integer> inputlist) {
       return inputlist.stream().reduce(1,(a,b)->a*b);
    }

}
