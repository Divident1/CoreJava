package Programming.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class EvenNumber {
    
    public static void main(String[] args) {
        
        HashSet<Integer> even= new HashSet<>();

        even.add(3);
        even.add(6);
        even.add(9);
        even.add(12);
        even.add(7);


        Iterator<Integer> itr= even.iterator();
        while(itr.hasNext())
        {
            int num=itr.next();

            if(num%2==0)
            {
                System.out.println(num);
            }
        }
    }
}
