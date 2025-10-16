package OOPS.Abstraction.ConstructorChaining;

public  abstract class School {
    String name;
    String loc;
    public School(String name, String loc) {
        this.name = name;
        this.loc = loc;
    }
    abstract public void work();


    
}
