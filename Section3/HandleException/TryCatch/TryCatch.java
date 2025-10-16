package Section3.HandleException.TryCatch;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("hii");
        System.out.println("hello");
        try{
            System.out.println(4/10);
        }catch(ArithmeticException e)
        {
            System.out.println("Exception Handled");
        }finally{
            System.out.println("bye bye");
        }
    }
}
