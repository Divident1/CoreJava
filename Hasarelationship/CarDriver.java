package Hasarelationship;

public class CarDriver {
    public static void main(String[] args) {
        
       
        Car c = new Car("Black", "BMW", 2000, new Engine("V8"));
        System.out.println(c.e);
        System.out.println(c.color);
        System.out.println(c.brand);
        System.out.println(c.price);
        System.out.println(c.e.type);
    }
}
