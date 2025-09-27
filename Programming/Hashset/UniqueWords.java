package Programming.Hashset;

import java.util.HashSet;

public class UniqueWords {
    
    public static void main(String[] args) {
        
        String s = new String("Java is very easy and is very Powerful");

        String words[]= s.split(" ");


        HashSet<String> unique= new HashSet<>();

        for(String word: words)
        {
            unique.add(word);
        }

        System.out.println(unique.size());
    }
}
