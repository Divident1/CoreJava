package OOPS.Inherintance;

public class SingleInherin {
    
    void eat(){
        System.out.println("The do eat pedigree");
    }

}


class Dog extends SingleInherin{
    void bark()
    {
        System.out.println("the dog bark always");
    }
}


class Main{
    public static void main(String args[])

    {
        Dog d1 = new Dog();
        d1.eat();
    }
}
