package Wrapper.UnBoxing;

public class First {
    public static void main(String[] args) {
        

        //Convert wrapper obj into num
        Integer obj= Integer.valueOf(20);

        int num=obj.intValue();
        System.out.println(obj);
        System.out.println(num);


    }
}
