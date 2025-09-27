package Section3.Array.Basics.ObjectClassMethod;

 class Student{

    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Student{name="+name+", age="+age+"}";
    }
    
}



public class ToString {
    
    public static void main(String[] args) {
        Student s = new Student("Gotam", 23);
        System.out.println(s);
    }
}
