package COLLECTION.SET.HashSet;

import java.util.HashSet;
import java.util.function.Consumer;

public class First {
    public static void main(String[] args) {
        HashSet<String> a1 = new HashSet<>();

        a1.add("gotam");
        a1.add("Singh");
        a1.add("Developer");

        Consumer<String> c = s-> System.out.println(s);

        /* a1.forEach(c); */


        a1.forEach(System.out::println);
    }
}
