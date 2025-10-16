package Program;

class Student {
    private int rolls;
    private int marks;
    private String name;

    
    public Student(int rolls, int marks, String name) {
        this.rolls = rolls;
        this.marks = marks;
        this.name = name;
    }
    public int getRolls() {
        return rolls;
    }
    public void setRolls(int rolls) {
        this.rolls = rolls;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        if(0<marks && marks<100)
        {
            this.marks=marks;
        }else{
            System.out.println("Invalid Marks");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}

public class Example{
    public static void main(String[] args) {
        Student s= new Student(1,101,"Gotam");

        System.out.println(s.getMarks());
        System.out.println(s.getName());
        System.out.println(s.getRolls());

    }
}