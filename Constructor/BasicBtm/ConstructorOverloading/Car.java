package Constructor.BasicBtm.ConstructorOverloading;

public class Car {
    String name;
    String color;
    double price;
    String model;
    public Car(String name) {
        this.name = name;
    }
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Car(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public Car(String name, String color, double price, String model) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.model = model;
    }


    
}
