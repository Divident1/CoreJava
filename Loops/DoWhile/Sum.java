package Loops.DoWhile;

public class Sum {
    
    public static void main(String[] args) {
        int num=1;
        int sum=0;
        do{
            sum+=num;
            num++;
        }
        while(num<=5);
        System.out.println(sum);
    }
}
