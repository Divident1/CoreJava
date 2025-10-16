package Programming.String;

import java.util.Arrays;

public class AnagramPractice {
    public static void main(String[] args) {
        String s="listen";
        String s2 ="silent";

        Boolean isTrue=false;

       char c[] = s.toCharArray();
       char c1[] =s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);

           if(c.length==c1.length)
           {
             for(int i=0;i<c.length;i++)
            {
                if(c[i]==c1[i])
                {
                    isTrue=true;
                }
            }
           }else{
            isTrue=false;
           }
            System.out.println(isTrue);

       


     


        
    }
}
