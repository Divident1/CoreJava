package Constructor;

public class Default {
    
    String name;
    int age;


    Default(){
        name="Gotam";
        age=12;
        System.out.println("Default Constructor is there");

    }


    public static void main(String args[])
    {
        Default d1 =new Default();
       System.out.println(d1.name+" "+d1.age);
    }

}
