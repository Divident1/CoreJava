package Section3.HandleException.thrown;

public class Thrown {
    int age;
    public static void age(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not eligble for vote");
        }
        else{
            System.out.println("Eligible ofor pote");
        }
    }
    
    public static void main(String[] args) {
        
        age(17);
    }
}
