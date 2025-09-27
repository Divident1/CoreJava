package Programming.Hashset;

import java.util.HashSet;

public class Duplicate {
    
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,5,6,7,8};
        System.out.println(arr.length);

        HashSet<Integer> unique= new HashSet<>();

        for(int num: arr)
        {
            unique.add(num);
        }

        System.out.println(unique);
        System.out.println(unique.size());
    }
}
