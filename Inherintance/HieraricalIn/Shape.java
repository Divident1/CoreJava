package Inherintance.HieraricalIn;

public class Shape {
    
    public String name;
    public double area;


    public Shape(String name, int area) {
        this.name = name;
        this.area = area;
    }

}

class Reactangle extends Shape{
    public int length;
    public int breadth;

    public Reactangle(String name, int area, int length, int breadth) {
        super(name, area);
        this.length = length;
        this.breadth = breadth;
        this.area= length*breadth;
    }
}





