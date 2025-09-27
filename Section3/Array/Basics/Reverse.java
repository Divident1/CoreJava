package Section3.Array.Basics;

import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size=sc.nextInt();
        int a[] = new int[size];
        int len=a.length;


        for(int i = 0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int j=len-1; j>=0;j--)
        
           {
            
             System.out.println("REversed array is:"+a[j]);
           }
        }
        
    }
