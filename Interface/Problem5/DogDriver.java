package Interface.Problem5;

class Animal{
    void eat(){
        System.out.println("animals eat");
    }
}

 interface Pet {
    void play();

    
}


class Dog extends Animal implements Pet{

    @Override
    public void play() {
     System.out.println("Dog play's Hide and Seeks");
    }
    
}
public class DogDriver{
    public static void main(String[] args) {
        Dog d= new Dog();
        d.play();
        d.eat();
    }
}