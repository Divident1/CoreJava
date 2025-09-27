package OOPS.Encapsulation.EncapBtm;

public class PersonDriver {
    
    public static void main(String[] args) {
        Person p= new Person("Gotam", "Delusional");

        System.out.println(p.getName());


        p.setGname("Delulu");

        System.out.println(p.getGname());
    }
}
