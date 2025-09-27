package Section3.Array.Basics;

import java.util.Scanner;

public class Second {
    
    public static void main(String[] args) {
        
        int arr[] = new int [3];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<=arr.length-1;i++)
        {
             System.out.println("Enter the value of a"+"["+i+"]");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<=arr.length-1;i++)
        {
           
            System.out.print("["+arr[i]+"]");
        }
        
    }
}
