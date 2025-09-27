package Wrapper.AutoBoxing;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        
        ArrayList<Integer> hello = new ArrayList<>();
// Autoboxing (int → Integer)
        hello.add(10);
        hello.add(20);
        hello.add(40);
        // Unboxing (Integer → int)
     int num=hello.get(0)+hello.get(1);

     System.out.println(num);
     System.out.println(hello);
    }
}
