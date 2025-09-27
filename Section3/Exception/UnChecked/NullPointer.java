package Section3.Exception.UnChecked;

public class NullPointer {
    
    public static void main(String[] args) {
        
        String s= "Gotam";

        System.out.println(s.charAt(2));

        String s2 =null;
        System.out.println(s2.charAt(1));
    }
}

