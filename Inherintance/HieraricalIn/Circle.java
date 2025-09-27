package Inherintance.HieraricalIn;

class Circle extends Shape{
    public int radius;

    public Circle(String name, int area, int radius) {
        super(name, area);
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}
