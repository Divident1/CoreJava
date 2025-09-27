package This;



public class Hello {

    String name;
    int age;


    Hello(String name, int age)
    {
        this.name=name;
        this.age=age;


    }


    void show()
    {
        System.out.println("The name is :"+name+"the age is :"+age);

    }
    
    public static void main(String args[])
    {
        Hello t1 = new Hello("Gotam", 12);
        Hello t2 = new Hello("Rahul", 22);



        t1.show();
        t2.show();
    }

}
