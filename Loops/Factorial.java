package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        int i=1;
        int mul=1;
        while(i<=number)
        {
            mul*=i;
            i++;

        }
        System.out.println("the Factoril is :"+mul);
    }
    
}
