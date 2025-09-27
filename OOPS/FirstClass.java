package OOPS;

public class FirstClass {
    
    String color;
    int speed;

    public void carproperties()
    {
        System.out.println("The speed of the car is:"+speed+"and the color of the car is"+color);
    }


    public static void main(String args[])
    {
        FirstClass obj=new FirstClass();

        obj.color="Red";
        obj.speed =200;
        obj.carproperties();
    }
}
