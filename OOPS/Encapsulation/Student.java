package OOPS.Encapsulation;

public class Student {

    
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
       
        if(age>17)
        {
            this.age=age;
        }
        else{
            System.out.println("Invalid Age");
        }

    }

    
}

class Main{

    public static void main(String args[])
    {
        Student s1= new Student();

        s1.setName("Gotam");
        s1.setAge(18);
        System.out.println("name"+s1.getName()+"Age"+s1.getAge());
        s1.setAge(6);

    }
}
