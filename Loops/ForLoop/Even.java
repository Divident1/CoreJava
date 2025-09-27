package Loops.ForLoop;

import java.util.Scanner;

public class Even {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();


        for(int i =10;i<=num;i+=2)
        {
           System.out.println(i);
        
        }
    }
}
