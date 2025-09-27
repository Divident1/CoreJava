package Singleton;

 class Singleton {


    private static Singleton instance;

    private Singleton(){
        System.out.println("The bock is created");
    }

    public static Singleton getInstance(){

        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }

    public void display()
    {
        System.out.println("What should i display");
    }
    
}
class Main{
    public static void main(String[] args) {
        
        Singleton s= Singleton.getInstance();
        Singleton s2 =Singleton.getInstance();
        s.display();
       System.out.println(s==s2);
    }
}
