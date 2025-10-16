package Strings.CountVowel;

public class CountVowel {
    public static void main(String[] args) {
        String s = "Programming";
        String s1= s.toLowerCase();
        int vowelcount=0;
        int conscount=0;
        StringBuffer s2 = new StringBuffer(s1);
        
        for(int i=0;i<=s2.length()-1;i++)
        {
            char ch = s2.charAt(i);

            if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            {
                vowelcount++;
            }
            else{
                conscount++;
            }

        }
        System.out.println("no of vowel are:"+vowelcount);
        System.out.println("no of consonent are:"+conscount);
    }
}
