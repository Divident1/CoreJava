package Hasarelationship.Aggregation.Program2;

public class Profile {
    String color;
    Double size;
    public Profile(String color, Double size) {
        this.color = color;
        this.size = size;
    }

}
 class Whatsapp {

    String message;
    String theme;
    Double fileSize;
    Profile prof;
    public Whatsapp(String message, String theme, Double fileSize) {
        this.message = message;
        this.theme = theme;
        this.fileSize = fileSize;
    }
    public void add(Profile prof)
    {
        if(this.prof==null)
        {
            this.prof=prof;
        }else{
            System.out.println("It's already added ");
        }

    }

     public void delete()
    {
        if(this.prof!=null)
        {
            this.prof=null;
        }else{
            System.out.println("It already deleted");
        }

    }
    
}

