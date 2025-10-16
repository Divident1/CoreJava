package OOPS.Abstraction.Regulator;

public class RegulatorDriver {
    public static void main(String[] args) {
        
        Regulator r = new Fan();
        r.rotateAntiClockwise();
        r.rotateClockwise();
    }
}
