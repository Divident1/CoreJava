package OOPS.Abstraction.Calculator;

abstract class MiniCalculator{

    public abstract void add(int a, int b);
}

class calci extends MiniCalculator{

    @Override
    public void add(int a, int b) {
       
        System.out.println(a-b);
    }
    
}



public class Calculator {
    public static void main(String[] args) {
        MiniCalculator c;

        c=new calci();
        c.add(10,5);
    }

    
}
