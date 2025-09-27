package Loops;


public class dowhile {
    public static void main(String[] args) {
        double x = 0.1;
        int count = 0;

        while (x != 1.0) {
            System.out.println("Iteration " + count + " -> x = " + x);
            x += 0.1;
            count++;

            // Safety stop to avoid infinite loop
            if (count > 20) {
                System.out.println("Loop didn't stop! Floating-point precision issue.");
                break;
            }
        }

        System.out.println("Final value of x = " + x);
    }
}
