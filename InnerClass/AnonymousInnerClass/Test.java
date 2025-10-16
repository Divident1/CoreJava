package InnerClass.AnonymousInnerClass;

public class Test {
    public static void main(String[] args) {
        
        // Normal use of ShoppingCart class
        ShoppingCart shping = new ShoppingCart(150.9);
        shping.payments(150.3);  

        // Anonymous inner class implementation of Payments
        Payments pay = new Payments() {
            @Override
            public void payments(double amount) {
                System.out.println("Amount paid " + amount + " by the credit card");
            }
        };

        // Using anonymous class object
        pay.payments(500.75);
    }
}
