package NonStatic;

import NonStatic.Student;

public class Student1 {
    public static void main(String[] args) {
        
        Student s= new Student();
        s.age=10;
        s.name="Gotam";
        s.id=111;
        System.out.println(s.age);
    }

    public char[] getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
    
}
