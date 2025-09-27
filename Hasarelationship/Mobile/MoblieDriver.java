package Hasarelationship.Mobile;

public class MoblieDriver {
    public static void main(String[] args) {
        Battery bate= new Battery("7000mah","Lithium");

        Mobile mob= new Mobile("Poco", "Integrated",2,bate);


        System.out.println(mob.brand);
        System.out.println(mob.processor);
        System.out.println(mob.warranty);
        System.out.println(mob.bat.Capacity);
        System.out.println(mob.bat.type);

    
    }
}
