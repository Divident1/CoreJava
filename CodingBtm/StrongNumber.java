package CodingBtm;

import java.util.Scanner;

public class StrongNumber {
    

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        
        int original=num;
        int sum=0;

        while(num!=0)
        {

            int digit=num%10;
            int fact=1;

            for(int i=1;i<=digit;i++)
            {
                fact*=i;
            }
            sum+=fact;
            num=num/10;
        }
        if(original==sum)
        {
            System.out.println("Number is Strong");
        }
        else{
            System.out.println("Number is not strong");
        }
    }
}
