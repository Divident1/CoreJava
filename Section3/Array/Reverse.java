package Section3.Array;

public class Reverse {
    public static void main(String[] args) {
        
        int [] a= {1,23,4,5,6,7,8};
        int len=a.length;
        int [] b= new int[len];
        int count=0;
        for(int i=len-1;i>=0;i--)
        {
            b[count]=a[i];
            count++;
        }
        
        for(int i=0;i<=len-1;i++)
        {
            System.out.println(b[i]);
        }
    }
    
}
