package Constructor;

public class ConstructorChaning {
    

    String name;
    int age;

    ConstructorChaning(){
        this("UNknown", 12);
        System.out.println("Default Constructori is called ");
    }

    ConstructorChaning(String n, int a)
    {
        this.name =n;
        this.age=a;
        System.out.println("Parameterized constructor is called ");
    }

    public static void main(String args[])
    {
        ConstructorChaning c1 = new ConstructorChaning(); // Default Constructor;
        ConstructorChaning c2 = new ConstructorChaning("Gotam", 12);

        

    }
}
