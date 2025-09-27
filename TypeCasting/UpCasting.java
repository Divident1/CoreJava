package TypeCasting;

public class UpCasting {

    void sound(){
        System.out.println("The animals sound very well");
    }
    
}

class Dog extends UpCasting{
    void sound(){
        System.out.println("The dog barks");
    }

    void guard(){
        System.out.println("The dog guards the ");
    }
}

class Main{

    public static void main(String[] args) {
        UpCasting a1=new Dog();

        a1.sound();

        Dog d= (Dog) a1;
        d.guard();
    }
}
