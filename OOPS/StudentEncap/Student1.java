package OOPS.StudentEncap;

public class Student1 {

    String name;
    int marks;
    int age;
    public Student1(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public int getAge() {
        return age;
    }
    public void setMarks(int marks) {
        if(0<=marks && marks<=100){
            this.marks=marks;
        }
    }


    


    
    
}



