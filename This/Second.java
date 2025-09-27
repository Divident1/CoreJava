package This;

public class Second {
    
    public static void add(int a, int b)
    {
        System.out.println("The sum is: "+(a+b));
    }

    public  void calc()
    {
        this.add(2,3);
    }


    public static void main(String args[])
    {
        Second s1= new Second();


        s1.calc();
    }
}
