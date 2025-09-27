package Programming.String;

import java.util.HashSet;

public class Duplicates {
    
    public static void main(String[] args) {
        String word= "programming";

        StringBuilder b=new StringBuilder();

        
        /* for(int i=0;i<=hello.length;i++)
        {
            System.out.println(hello[i]);
        } */

        HashSet<Character> unique= new HashSet<>();

        for(char ch: word.toCharArray())
        {
            if(!unique.contains(ch)){
                unique.add(ch);
                b.append(ch);

            }
        }
        System.out.println(b);
    }
}
