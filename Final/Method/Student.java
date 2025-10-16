package Final.Method;

class Test{
    public   void age(){
        System.out.println("Hello ji kese ho");
    }

}

class Test1 extends Test{
    @Override
    public   void age(){
        System.out.println("Hello me nhi jane wala");
        
    }
}

public class Student {
    public static void main(String[] args) {
        Test t= new Test();
        t.age();
    }
    
}
