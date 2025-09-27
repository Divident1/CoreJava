package Loops;

public class SumOfNumber {
    
    public static void main(String args[])
    {
        int sum=0;
        int num=1;
        while(num<=5)
        {
            sum+=num;
            num++;
            
        }
        System.out.println("The sum of 1 to 5="+sum);
    }
}
