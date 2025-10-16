package Interface.Class1;

interface Bank {
void withdraw();
void deposit();

    
} 
class ICIC implements Bank{

    @Override
    public void withdraw() {
        System.out.println("Amount withdrawn");
      
    }

    @Override
    public void deposit() {
        System.out.println("Amount Deposited");
       
    }


    
}

 public class BankDriver{
    public static void main(String[] args) {
        Bank b= new ICIC();
        b.withdraw();
    }
}