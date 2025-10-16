package COLLECTION.SET.HashSet;

import java.util.HashSet;

class Student{
    String name;
    int id;
    double sal;
    public Student(String name, int id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public boolean equals(Object obj)
    {
        Student stu= (Student ) obj;

        if(this.hashCode()==stu.hashCode())
        {
            return true;
        }else{
            return false;
        }
    }

    public int hashCode(){
        return id;
    }




    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", sal=" + sal + "]";
    }

    

    
}


public class HashSetObject {
    

    public static void main(String[] args) {
        
        HashSet<Student> hs= new HashSet<Student>();

        hs.add(new Student("Gotam", 1, 23.43));
         hs.add(new Student("Singh", 2, 21.43));
         hs.add(new Student("Developer",3, 14.2));

         hs.forEach(s-> System.out.println(s));

    }
}
