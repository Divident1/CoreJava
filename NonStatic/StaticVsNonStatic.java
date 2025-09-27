package NonStatic;

public class StaticVsNonStatic {
    
    String name;
    static String College;

    static void College(String c)
    {
        College =c;
    }
     void Name(String n)
     {
        name=n;
     }

     void show(){
        System.out.println("My name is "+name+" College "+College);
     }




     public static void main(String args[])
     {
        StaticVsNonStatic s1= new StaticVsNonStatic();
        StaticVsNonStatic s2 = new StaticVsNonStatic();


        s1.College("SVCE");

        s1.Name("Gotam");

        s2.Name("Rahul");


        s1.show();
        s2.show();
        


     }
}
