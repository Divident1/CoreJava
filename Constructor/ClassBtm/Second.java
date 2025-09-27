package Constructor.ClassBtm;


 class InnerSecond {

    String name;
    int age;
    int id;


    InnerSecond(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    InnerSecond(String name, int id)
    {
        this.name=name;
        this.id=id;
    }

    
}

public class Second {
    public static void main(String[] args) {
        InnerSecond a= new InnerSecond("Gotam",12);
        System.out.println(a.name+""+a.id);
        System.out.println(a.name+""+a.age);

        
        

        
    }
}
