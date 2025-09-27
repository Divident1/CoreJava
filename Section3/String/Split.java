package Section3.String;

public class Split {
    
    public static void main(String[] args) {
        
        String name="Javaf is very easyajaj";

        String res[]= name.split(" ");

        int len=0;
        System.out.println(res[0]);

        for(int i=0;i<=res.length-1;i++)
        {
            
            if(res[i].length()>len)
            {
                len=res[i].length();
            }
        }
        System.out.println(len);

    }
}
