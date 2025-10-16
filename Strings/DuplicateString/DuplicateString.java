package Strings.DuplicateString;

public class DuplicateString {
    
   public static void main(String[] args) {
     String s = "Programming";
    String h = s.toLowerCase();
    char[] chars= h.toCharArray();

    StringBuffer s1 = new StringBuffer(h);

    for(int i=0;i<=s1.length()-1;i++)
    {
        int count=1;
        if(chars[i]=='0')
        {
            continue;
        }


        for(int j=i+1;j<=s1.length()-1;j++)
        {
            if(chars[i]==chars[j])
            {
                count++;
                chars[j]='0';
            }
        }
         if(count>1&&chars[i]!='0')
    {
        System.out.print(chars[i]+",");
    }

        
    }
   
   }
    
}
