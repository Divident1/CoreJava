package CodingBtm;

import java.util.Scanner;

public class ReverseNum {
    
    public static void main(String args[])
    {

        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int original=num;
        int reverse=0;

        while(num!=0){

            int rem=num%10;
             reverse=reverse*10+rem;
             num=num/10;
        }

        if(reverse==original)
        {
            System.out.println("Number is Pallindrome"+reverse);
        }
        else{
            System.out.println("number is not pallindorm"+reverse);
        }

    }
}
