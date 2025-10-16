package OOPS.Abstraction.ConstructorChaining;

public class SchoolDriver {
    public static void main(String[] args) {
        
        School s= new Student("Gotam", "Srinagar");
        System.out.println(s.name);
        System.out.println(s.loc);
        
    }
}
