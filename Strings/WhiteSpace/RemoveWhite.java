package Strings.WhiteSpace;

public class RemoveWhite {
    public static void main(String[] args) {
        
        String s = " java Programing";
        StringBuilder s1 = new StringBuilder(s);

       String h= s.replace(" ","");
        System.out.println(h);
    }
    
}
