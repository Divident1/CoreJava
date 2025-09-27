package OOPS.Abstraction;

abstract class Payment {
    
    abstract void proccessPayment(double amount);

    public void paymentSuccessfull(){
        System.out.println("The payemnt is successfull");
    }

}


class CreditCardPayment extends Payment{
    @Override
    public void proccessPayment(double amount)
    {
System.out.println("Porcessing creditcad Payment of "+amount);
    }
}

class UpiPayment extends Payment{
    @Override
    public void proccessPayment(double amount)
    {
        System.out.println("Processsing Upi Payment of"+amount);
    }
}

class Main{
    public static void main(String[] args) {
        
        Payment p1 = new CreditCardPayment();

        p1.proccessPayment(5000);
        p1.paymentSuccessfull();


        Payment p2 = new UpiPayment();
        p2.proccessPayment(6000);
        p2.paymentSuccessfull();;

    }
}
