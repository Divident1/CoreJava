package Superkeyword;

class Animal{
    String name="Animal";

}
class Dog extends Animal{
    String name="Dog";

    void display()
    {
        System.out.println("Dog name is"+name);
        System.out.println("Animal name is:"+super.name);
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Dog a1 = new Dog();
        a1.display();
    }
}
