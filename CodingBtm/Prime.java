package CodingBtm;

import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        boolean isPrime=true;
        int num=sc.nextInt();
        if(num==1)
        {
            isPrime=false;
        }

        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime==false)
        {
            System.out.println("Number is not Pirme");
        }
        else{
            System.out.println("Number is prime");
        }

    }
}
