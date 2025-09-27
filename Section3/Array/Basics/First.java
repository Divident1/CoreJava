package Section3.Array.Basics;

public class First {
    


    public static void main(String[] args) {
        
        int arr[]= new int[3];
        System.out.println("arr");
        System.out.println(arr);
        System.out.println(arr[0]);
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]= 40;
       /*   System.out.println(arr[0]);
         System.out.println(arr[1]);
          
          System.out.println(arr[-1]); */

        int i;
          while( i<arr.length-1)
          {
            System.out.println(arr[i]);
          }
    }
}
