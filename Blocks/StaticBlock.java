package Blocks;

public class StaticBlock {
    
    static int age=10;

    static {
        age =20;
        System.out.println("Static block get executed");
    }


    {
        System.out.println("Non Static Block get Executed");
    }
    StaticBlock(){
        System.out.println("Constructor is created");
    }


    public static void main(String[] args) {
        System.out.println("Main method will get executed");

        StaticBlock a1 = new StaticBlock();
        StaticBlock a2 = new StaticBlock();

    }
}
