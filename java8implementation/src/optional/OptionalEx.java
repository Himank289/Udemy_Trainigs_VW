package optional;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
       Optional<String> s= Optional.ofNullable(" Hello ");

       if(s.isPresent()){
           System.out.println(s.get());
       }
       else{
           System.out.println(Optional.empty());
       }
    }
}
