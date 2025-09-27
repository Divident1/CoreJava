package Constructor;

public class Copy {
    

    String name;
    int age;

    Copy(String n, int a){
        name=n;
        age=a;

    }
    Copy(Copy c1){

        this.name=c1.name;
        this.age=c1.age;

    }

    public static void main(String args[])
    {
        Copy c2= new Copy("Gotam", 12);

        Copy c3 = new Copy(c2);
        System.out.println(c3.name+"Default constructor:"+ c2.age);
    }
}
