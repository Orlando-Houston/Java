package Oracle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class O47PersonTest {
    public  static void  checkAge(List<O47Person>list, Predicate<O47Person>predicate){

        for (O47Person p:list){
            if (predicate.test (p)){
                System.out.println (p.getName ()+" ");
            }
        }

    }

    public static void main(String[] args) {
        List<O47Person>iList= Arrays.asList (new O47Person ("Hank",45),
                                           new O47Person ("Charlie",40),
                                           new O47Person ("Smith",38));
        //line n1


    }
}
