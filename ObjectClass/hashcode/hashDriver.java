package ObjectClass.hashcode;

 class HashCode {
    String hello;
    String ext;

    public void hello(){
        System.out.println("Kese ho");
    }
    
}

public class hashDriver{
    public static void main(String[] args) {
        HashCode h= new HashCode();
        System.out.println(h.hashCode());
        HashCode h1 = new HashCode();
        System.out.println(h.hashCode());
    }
}