package Section3.Array.Basics;

import java.util.Scanner;

public class MaxNumber {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }

        if(a.length==0)
        {
            System.out.println("There is no element in an array.");
        }
       else{
         int max =a[0];
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
         System.out.println(max);
       }
       
    }
}
