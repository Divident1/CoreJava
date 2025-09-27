package Constructor.ClassBtm;

class Student{

    int age;
    String name;

    Student(String n, int a)
    {
       name=n;
        age=a;
       
}
}


public class Frist {
    public static void main(String[] args) {

        Student s1 = new Student("Gotam", 12);
        System.out.println(s1.name+" "+s1.age);
        

        
    }
}
