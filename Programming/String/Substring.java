package Programming.String;

import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static void main(String[] args) {
        String s="listen";

        StringBuilder sb= new StringBuilder("");

        List<String> temp= new ArrayList<>();
        for(int i=0;i<=s.length()-1;i++)
        {
            
            for( int j=i+1;j<=s.length();j++)
            {
                System.out.println( );
               System.out.print(s.substring(i,j)+" ");
                
               
            }
           
             
        }
    }
}
