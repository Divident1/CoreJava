package OOPS.Encapsulation;

public class BankAccount {
    
    private String AccountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        AccountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println(amount+"deposited. New Balance"+balance);
        }
        else{
            System.out.println("Invalid deposit amount!");
        }
    }


    public void withdrawn(double amount)
    {
        if(amount<=balance && amount>0)
        {
            balance -=amount;
            System.out.println(amount+"withdrawn.New Balance:"+balance);
        }
        else{
            System.out.println("Invalid Deposiot amount");
        }
    }
}
class Main{
    public static void main(String[] args) {
        
        BankAccount b1= new BankAccount("Gotam", 5000);

        b1.deposit(2000);
        b1.withdrawn(2000);
        b1.withdrawn(6000);
    }
}