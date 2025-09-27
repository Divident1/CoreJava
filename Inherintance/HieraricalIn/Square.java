package Inherintance.HieraricalIn;

class Square extends Shape{
    public int side;

    public Square(String name, int area, int side) {
        super(name, area);
        this.side = side;
        this.area= side*side;
    }
    
}
