package Constructor.BasicBtm;

class Car{

    String name;
    double price;
    String color;
    public Car(String name) {
        this.name = name;
    }
    public Car(String name, double price) {
         this(name);
        this.price = price;
    }
    public Car(String name, double price, String color) {
        this(name,price);
        this.color = color;
    }


}

 class Thisn {
    
    public static void main(String[] args) {
        
        Car c= new Car("Hero", 7000, "Red");
        System.out.println(c.name+""+c.price+" "+c.color);
    }
}
