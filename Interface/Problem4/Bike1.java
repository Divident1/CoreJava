package Interface.Problem4;

 interface Handle {
    void turnleft();
    void turnRight();
    void holdStraight();

    
}
interface Horn {
    void press();
    void release();

    
}

class Bike implements Handle, Horn{

    @Override
    public void press() {
      System.out.println("Press the brake");
    }

    @Override
    public void release() {
       System.out.println("release the brake");
    }

    @Override
    public void turnleft() {
   System.out.println("Turn Left");
    }

    @Override
    public void turnRight() {
       System.out.println("Turn right");
    }

    @Override
    public void holdStraight() {
      System.out.println("Hold straight");
    }
    
}


public class Bike1{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.holdStraight();
        b.turnRight();
        b.turnleft();
        b.press();
        b.release();
    }
}