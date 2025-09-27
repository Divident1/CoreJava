package Section3.Array;

import java.util.Scanner;

public class Odd {
    
    public static void main(String[] args) {
        int[] a =new int[10];

        Scanner sc= new Scanner(System.in);
        
        int count=0;
       
        while(count<a.length)
        {
            int num=sc.nextInt();

            if(num%2!=0)
            {
                a[count]=num;
                count++;
            }
            else{
                System.out.println("NUmber is even and can't be added");
            }

        }


        for(int value:a)
        {
            System.out.print(value+",");
        }
    }
}
