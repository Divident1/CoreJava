package Superkeyword.SuperMethod;

class Animal{
    void sound(){
        System.out.println("The Animal make sounds");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("The dog make bark");
    }


    void display(){
        sound();
        super.sound();
    }
}

public class Main {

    public static void main(String[] args) {
        
        Dog a1= new Dog();
        a1.display();
    }
    
}
