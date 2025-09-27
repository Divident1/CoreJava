package CodingBtm;

import java.util.Scanner;

public class ArmStrongNumber {
    

    public static void main(String args[])
    {

        Scanner sc =new Scanner(System.in);

        int num =sc.nextInt();

        int original=num;
        int sum=0;
        int digits= String.valueOf(num).length();


        while(num!=0)
        {
            int digit= num%10;
            sum =sum+(int)Math.pow(digit, digits);
            num=num/10;
        }
        if(sum==original)
        {
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }

    }
}
