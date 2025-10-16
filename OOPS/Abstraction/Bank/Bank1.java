package OOPS.Abstraction.Bank;

 abstract class Bank{

    abstract void createAccount();
}

class Saving extends Bank{

    @Override
    void createAccount() {
        
       System.out.println("Hello sir apka abstract saving method tyaar ha");
    }
    
}

class FD extends Bank{

    @Override
    void createAccount() {
       System.out.println("Hello Sir apka abstract FD wala bank tyaar ha");
    }
    
}


public class Bank1 {

    public static void main(String[] args) {
        Bank b1;

        b1= new Saving();
        b1.createAccount();

        b1= new FD();
        b1.createAccount();
    }
    

}
