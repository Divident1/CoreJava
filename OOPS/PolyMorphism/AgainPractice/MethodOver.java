package OOPS.PolyMorphism.AgainPractice;



class Printer{
    public int NUmber(int a)
    {
        System.out.println("Interger is :"+a);
        return a;
    }

    public double NUmber(double a)
    {
        System.out.println("Double is :"+a);
        return a;
    }
    public String NUmber(String a)
    {
        System.out.println("String is :"+a);
        return a;
    }
}
public class MethodOver {

    public static void main(String[] args) {
        Printer p = new Printer();
        p.NUmber(10);
        p.NUmber(10.5);
        p.NUmber("Hello");
    }
    
}
