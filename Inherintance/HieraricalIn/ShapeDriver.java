package Inherintance.HieraricalIn;
class ShapeDriver{
    public static void main(String[] args) {
        Reactangle rec= new Reactangle("Reactangle",0,5,6);
        Circle cir= new Circle("Circle",0,7);
        Square sq= new Square("Square",0,4);

        System.out.println("Area of Reactangle is: "+rec.area);
        System.out.println("Area of Circle is: "+cir.area);
        System.out.println("Area of Square is: "+sq.area);
    }
}