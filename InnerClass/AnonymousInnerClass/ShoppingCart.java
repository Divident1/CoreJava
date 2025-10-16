package InnerClass.AnonymousInnerClass;

public class ShoppingCart implements Payments {
    double amount;
    

    public ShoppingCart(double amount) {
        this.amount = amount;
    }


    @Override
    public void payments(double amount) {
     System.out.println("Paid:"+amount+"By Credit Card");
    }
    
}
