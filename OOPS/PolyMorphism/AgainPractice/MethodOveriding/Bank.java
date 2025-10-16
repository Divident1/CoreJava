package OOPS.PolyMorphism.AgainPractice.MethodOveriding;

class Bank1{
    public void withdrawn()
    {
        System.out.println("Enter the amount to be withdrawn");
    }

}

class SBI extends Bank1{
    @Override
    public void withdrawn(){
        System.out.println("Enter the amount to be withdrawn from the SBI");
    }
}

class Axis extends Bank1{
    @Override
    public void withdrawn(){
        System.out.println("Enter the amount to be withdrawn from the AXIS");
    }
}




public class Bank {
    public static void main(String[] args) {
        Bank1 b1= new SBI();
        Bank1 b2= new Axis();

        b1.withdrawn();

        
    }
    
}
