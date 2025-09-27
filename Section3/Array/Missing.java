package Section3.Array;

public class Missing {
    
    public static void main(String[] args) {
        
        int[] arr= {1,2,4,5,6};

        int n=arr.length;

        int sum= n*(n+1)/2;
        int accnum=0;

        for(int num:arr)
        {
            accnum+=num;
        }
        int missingNum=accnum-sum;
        System.out.println(missingNum);
    }
}
