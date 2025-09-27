package NonStatic;

public class NonStatic {
    
    int count=0;
    static int staticcount=0;


    NonStatic(){
        count++;
        staticcount++;
    }

    void show(){
        System.out.println("nonStatic count is:"+count+"Static count is:"+staticcount);
    }


    public static void main(String args[])
    {

        NonStatic s1= new NonStatic();
        NonStatic s2= new NonStatic();


        s1.show();
        s2.show();
    }
}
