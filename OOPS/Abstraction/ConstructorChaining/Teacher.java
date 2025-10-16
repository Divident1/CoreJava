package OOPS.Abstraction.ConstructorChaining;

public class Teacher extends School {

    public Teacher(String name, String loc) {
        super(name, loc);
    }

    @Override
    public void work() {
      System.out.println("This is teacher information");
    }
    
}
