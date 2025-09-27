package CodingBtm;

import java.util.Scanner;

public class CountDigit {
    
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        
        int num=sc.nextInt();
        int count=0;


        if(num==0)
        {
            count =1;
        }
        while(num!=0)
        {
             num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
