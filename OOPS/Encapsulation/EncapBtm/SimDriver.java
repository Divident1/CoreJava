package OOPS.Encapsulation.EncapBtm;

public class SimDriver {
    public static void main(String[] args) {
      
        Sim s = new Sim(6006919231l, "JIO", "199");

    
        System.out.println(s.getNumber());
        System.out.println(s.getServiceProvider());
        System.out.println(s.getPlan());

  
        s.setServiceProvider("Airtel");
      

      
        System.out.println(s.getNumber());
        System.out.println(s.getServiceProvider());
        System.out.println(s.getPlan());
    }
}
