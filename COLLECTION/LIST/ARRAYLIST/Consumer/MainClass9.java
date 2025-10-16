package COLLECTION.LIST.ARRAYLIST.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass9 {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("hello");
        a1.add("java");
        a1.add("Android");

        // classic indexed loop
      /*   for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i).length());
        } */

        // for(String ele : a1)
        // {
        //     System.out.println(ele);
        // }

        // Consumer variable (lambda)
        Consumer<String> ref = s -> System.out.println(s.length());
        a1.forEach(ref);

        // inline lambda
        a1.forEach(s -> System.out.println(s.length()));

        // method reference — prints the string itself
        a1.forEach(System.out::println);
    }
}
