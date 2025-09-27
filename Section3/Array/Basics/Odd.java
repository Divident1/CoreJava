package Section3.Array.Basics;

import java.util.Scanner;

public class Odd {
    

     public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int size = sc.nextInt();

        int a[] = new int[size];


        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }

int sum=0;

        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2!=0)
            {
                sum +=a[i];

            }
        }
        System.out.println("Sum of odd number is"+sum);
    }
}
