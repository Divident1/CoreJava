package Hasarelationship.Aggregation.Program2;

public class WhatsappDriver {
   public static void main(String[] args) {
     
    Whatsapp wha= new Whatsapp("kese ho","Dark",9.9);
    wha.add(new Profile("Pink",4.3));
    System.out.println(wha.message);
    System.out.println(wha.theme);
    System.out.println(wha.fileSize);




    System.out.println(wha.prof.color);
    System.out.println(wha.prof.size);
   }
}
