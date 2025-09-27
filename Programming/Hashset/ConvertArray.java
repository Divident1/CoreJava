package Programming.Hashset;

import java.util.HashSet;

public class ConvertArray {
    

    public static void main(String[] args) {
        
        HashSet <Integer> hello = new HashSet<>();

        hello.add(1);
        hello.add(2);
        hello.add(3);
        hello.add(4);
         hello.add(4);
        System.out.println(hello);


        Object [] arr= hello.toArray();
        for(Object num:arr)
        {
            System.out.println(num);
        }




        
    }
}
