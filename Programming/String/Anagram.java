package Programming.String;

import java.util.HashSet;

public class Anagram {
    
    public static void main(String[] args) {
        
        String s1 = "tom";
        String s2= "mst";


        char[] hello= s1.toCharArray();

        char[] hello2 =s2.toCharArray();

       HashSet<Character> nalu= new HashSet<>();
       HashSet<Character> nalu2= new HashSet<>();

       for(char ch: hello)
       {
        nalu.add(ch);
       }
      
       for(char ch: hello2)
       {
        nalu2.add(ch);
       }

       if(nalu.equals(nalu2))
       {
        System.out.println("true");

       }
       else{
        System.out.println("false");
       }
    }
}
