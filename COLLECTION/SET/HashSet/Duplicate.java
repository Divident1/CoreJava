package COLLECTION.SET.HashSet;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        
        String q ="programming";
       StringBuffer b=new StringBuffer();

        char [] c = q.toCharArray();
       
        HashSet<Character> hello = new HashSet<>();

        for(char ch: c)
        {
            if(!hello.contains(ch))
            {
                hello.add(ch);
                b.append(ch);

            }
        }
        System.out.println(b);

    }
    
}
