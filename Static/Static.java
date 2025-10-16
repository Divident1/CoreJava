package Static;

class Student {
    static int count = 0;  // shared among all
    String name;           // each object has its own

    Student(String n) {
        name = n;
        count++;
    }

   
}

class Ramu extends Student{
    Ramu(String n)
    {
        super("Gotam");
    }

 void display() {  // instance method
        System.out.println("Name: " + name);
        System.out.println("Total: " + count);  // can access static variable
    }
}

public class Static {
    public static void main(String[] args) {
        Ramu s1 = new Ramu("Ram");
        Student s2 = new Student("Amit");

        s1.display();
        
    }
}
