package OOPS.PolyMorphism.AgainPractice.MethodOveriding;

class Vehicle{
    public void start(){
        System.out.println("Car Works");
    }
}

class Car1 extends Vehicle{
    public void opentrunk(){
        System.out.println("Car is working");
    }
}
class Bike extends Vehicle{
    public void kickstart(){
        System.out.println("Bike is working");
    }
}



public class Car {

    public static void main(String[] args) {
      Vehicle v1 = new Car1();
      Vehicle v2 = new Bike();

      if(v1 instanceof Car1)
      {
       Car1 c= (Car1) v1;
       c.opentrunk();
      }
        
    }
    
}
