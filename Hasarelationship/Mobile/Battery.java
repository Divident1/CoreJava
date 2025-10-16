package Hasarelationship.Mobile;

public class Battery {
    String Capacity;
    String type;
    public Battery(String capacity, String type) {
        this.Capacity = capacity;
        this.type = type;
    }
    
}

class Mobile{

    String brand;
    String processor;
    int warranty;
    Battery bat;
    public Mobile(String brand, String processor, int warranty, Battery bat) {
        this.brand = brand;
        this.processor = processor;
        this.warranty = warranty;
        this.bat = bat;
    } 
}
