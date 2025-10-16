package OOPS.Abstraction.Regulator;

public class Fan extends Regulator {

    @Override
    public void rotateClockwise() {
      System.out.println("Fan is working Clockwise");
    }

    @Override
    public void rotateAntiClockwise() {
      System.out.println("Fan is Working anticlockwise");
    }
    
}
