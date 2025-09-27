package OOPS.PolyMorphism;

 class RunTime {
    
    void sound()
    {
        System.out.println("Animal make their own sound");
    }
}


class Dog extends RunTime{

    void sound()
    {
        System.out.println("Dog make theirown sound");
    }
}
class Cat extends RunTime{
    void sound(){
        System.out.println("Cat make their own sound");
    }
}

public class Main{
    public static void main(String args[])
    {

        RunTime r;
        r= new Dog();
        r.sound();
        r= new Cat();
        r.sound();
    }
}
