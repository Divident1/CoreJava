package Hasarelationship;

public class Engine {
    
    String type;

    public Engine(String type) {
        this.type = type;
    }
    
}

class Car{


    String color;
    String brand;
    double price;
    Engine e;
   
    
    public Car(String color, String brand, double price, Engine e) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.e = e;
    }
    



    

}
