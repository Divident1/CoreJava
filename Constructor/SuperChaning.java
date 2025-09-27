package Constructor;

public class SuperChaning {
    
    String name;

    SuperChaning(String name)
    {
        this.name =name;
        System.out.println("Parent Constructor is called ");
    }

    
}

 class Student extends SuperChaning{

    int age;
    Student(String name, int a) {
        super(name);
        age = a;
     System.out.println("Child Constructor is called ;");
    }


    

}
class Main{
    public static void main(String args[])
    {
        Student s = new Student("Gotam",22);
    }
}