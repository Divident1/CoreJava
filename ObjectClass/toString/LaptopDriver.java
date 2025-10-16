package ObjectClass.toString;

import Final.Method.Student;

class Laptop {
    String brand;
    int price;
    String processor;
    String model;

    
    public Laptop(String brand, int price, String processor, String model) {
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        this.model = model;
    }


    @Override
    public boolean equals(Object o)
    {
        Laptop l = (Laptop) o;
        return this.brand==l.brand && this.price==l.price && this.processor ==l.processor && this.model ==l.model;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", price=" + price + ", processor=" + processor + ", model=" + model + "]";
    }
    
    
}


public class LaptopDriver{
    public static void main(String[] args) {
        Laptop l =new Laptop("lenovo", 1000, "v1", "alkja");
        System.out.println(l);
        Laptop l1 =new Laptop("lenovo", 1000, "v1", "alkja");
        System.out.println(l.equals(l1));


    }
}