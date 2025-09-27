package Loops.DoWhile;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int mul=1;
        int fact =1;

        do{
            fact*=mul;
            mul++;
        }
        while(mul<=num);
        System.out.println(fact);
    }
}
