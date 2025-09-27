package Loops.ForLoop;

public class Pattern {
    
    public static void main(String[] args) {
        

        for(int i=0;i<=2;i++)
        {
            System.out.println();
            for(int j=0;j<=3-i;j++)
            {
                System.out.print("*");
            }
        }
    }
}
