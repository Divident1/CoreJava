package Section3.Array.Basics.ObjectClassMethod;

class HashCode{
    String Author;
    int price;

    public int hashCode(){
        return this.price;
    }

    public static void main(String[] args) {
        HashCode s1 = new HashCode();
        s1.Author="Gotam";
        s1.price=1500;

        System.out.println(s1.hashCode());

        HashCode s2 =new HashCode();
         s2.Author="Rajat";
        s2.price=2500;
        System.out.println(s2.hashCode());
    }
}


