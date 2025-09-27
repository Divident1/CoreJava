package Programming.Hashset;

import java.util.HashSet;

public class FirstProgram {
    
 

    public static void main(String[] args) {
        HashSet<String> hashed= new HashSet<>();

        hashed.add("Apple");
        hashed.add("Orange");
        hashed.add("Banana");
        hashed.add("lemon");

        System.out.println(hashed);

        hashed.remove("Apple");
          System.out.println(hashed);


          for(String Fruit:hashed)
          {
            System.out.println(Fruit);
          }
    }
}
