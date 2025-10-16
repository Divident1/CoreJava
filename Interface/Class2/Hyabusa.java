package Interface.Class2;

public class Hyabusa implements Car1, Bike {

    @Override
    public void accelrate() {
     System.out.println("Hyabusa Accelarte");
    }

    @Override
    public void brake() {
        System.out.println("Hybusa performs brake");
      
    }

    @Override
    public void start() {
        System.out.println("Hybusa Starts");
      
    }

    @Override
    public void stop() {
        System.out.println("Hybusa Stops");
      
    }
    
}
