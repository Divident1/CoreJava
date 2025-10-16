package ObjectClass.toString;

 class ToString {
    String name;
    String fatherName;

    public void Hello(){
        System.out.println("Kese ho");
    }
}

public class ToStringDriver{
    public static void main(String[] args) {
        ToString h= new ToString();
        ToString h1 = new ToString();
        System.out.println(h.toString());
        System.out.println(h1.toString());




    }



}
