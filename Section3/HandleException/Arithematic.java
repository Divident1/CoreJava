package Section3.HandleException;

public class Arithematic {
    public static void main(String[] args) {
        
       

        try{
             int a[] ={10,20,30};
           System.out.println(a[5]); 
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception"+e);
        }
        finally{
            System.out.println("It will execute perman");
        }
    }
}
