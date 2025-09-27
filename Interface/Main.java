package Interface;

interface Animal{
    void sound();
    void eat();

}

interface Pet{
    void play();
}

class Dog implements Animal, Pet{

    @Override
    public void play() {
        // TODO Auto-generated method stub
       System.out.println("Dog can Play");
    }

    @Override
    public void sound() {
        // TODO Auto-generated method stub
        System.out.println("The Dog can Bark");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
       System.out.println("The dog can eat");
    }
    
}


class Cat implements Animal{

    @Override
    public void sound() {
        // TODO Auto-generated method stub
      System.out.println("The cat can meow");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
       System.out.println("The cat can eat");
    }
    
}


public class Main {
    public static void main(String[] args) {
        
        Animal a1 =new Dog();
        a1.sound();
        a1.eat();

        Pet p1 = new Dog();

        p1.play();

        Animal a2 = new Cat();
        a2.sound();
        a2.eat();
    }
    
}
