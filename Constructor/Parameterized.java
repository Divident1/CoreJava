package Constructor;

public class Parameterized {
    
    String name;
    int age;


    Parameterized(String n, int a)
    {
        name =n;
       age=a;
        System.out.println("Parameterized Constructor is there");
    }

    public static void main(String[] args) {
        
        Parameterized p1 = new Parameterized("Gotam", 12);

        System.out.println(p1.name+" "+p1.age);
    }

}
