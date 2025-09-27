package Constructor.BasicBtm.ConstructorChaining;

public class Main {
    public static void main(String[] args) {
        Laptop l= new Laptop("Mac",16,"integrete", 512,"M1");
        
        System.out.println(l.graphicCard);
        System.out.println(l.ram);
        System.out.println(l.brand);
    }
}
