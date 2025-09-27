package Section3.Array.Basics.ObjectClassMethod;

public class finalize {
    String name;
    int age;

    

    public finalize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void finalize(){
        System.out.println("it return the finalize number");

    }

    public static void main(String[] args) {
        finalize f1= new finalize("Gotam",12);
        f1=null;
        System.gc();
    }
}

