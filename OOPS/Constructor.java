package OOPS;

public class Constructor {
    
    String name;
    int age;

    Constructor(String n, int a){
        name =n;
        age=a;
    }

    void Student()
    {
        System.out.println("The studnt name is:"+name+"age is :"+age);
    }



    public static void main(String args[])
    {
        Constructor student=new Constructor("Gotam", 12);
        Constructor student2 = new Constructor("Rahu", 23);

        student.Student();
        student2.Student();



    }
}
