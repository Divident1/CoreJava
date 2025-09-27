package Programming.Hashset;

import java.util.HashSet;

public class TwoCommon {
    
    public static void main(String[] args) {
        
        HashSet<Integer> number= new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        HashSet<Integer> number2 = new HashSet<>();
        number2.add(1);
        number2.add(9);
        number2.add(5);
         
       number.retainAll(number2);
       

       if(number.isEmpty())
       {
        System.out.println("true");
       }else{
        System.out.println("false");
       }
    }
}
