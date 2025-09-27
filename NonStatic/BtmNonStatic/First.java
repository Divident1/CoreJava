package NonStatic.BtmNonStatic;

class Hello{

    String name;
    int age;

   static void show()
    {
        System.out.println("when you will show the ouput");
    }
}



public class First {
    
   public static void main(String[] args) {
     Hello h1= new Hello();
    h1.name="Gotam";

    h1.age=12;
    Hello.show();
    
   }
}
