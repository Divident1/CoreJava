package Interface.Class2;

public class HyabusaDriver {
    
    public static void main(String[] args) {
        
        Bike b = new Hyabusa();
        b.accelrate();
        b.brake();

        Car1 c= new Hyabusa();
        c.start();
        c.stop();
    }
    
   
}
