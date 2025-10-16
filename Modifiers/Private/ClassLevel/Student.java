package Modifiers.Private.ClassLevel;

public class Student {
    

    private void Hello(){
        System.out.println("Say hello to me");
    }
public static void main(String[] args) {
        Student s= new Student();
        s.Hello();
    }


}

