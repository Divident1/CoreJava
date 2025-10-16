package OOPS.Abstraction.ConstructorChaining;

public class Student extends School {

    Student(String name, String loc){
        super(name,loc);
    }

    @Override
    public void work() {
        System.out.println("This is student information");
     
    }



}
