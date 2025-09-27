package Hasarelationship.Aggregation.Program1;

public class EarPhone {
    double screenSize;
    String brand;
    public EarPhone(double screenSize, String brand) {
        this.screenSize = screenSize;
        this.brand = brand;
    }
    
}



class Mobile{

    int warranty;
    int length;
    EarPhone e;
    public Mobile(int warranty, int length) {
        this.warranty = warranty;
        this.length = length;
    }

    public void insert(EarPhone e)
    {
        if(this.e==null)
        {
            this.e =e;
            System.out.println("Earphone inserted");
        }
      else{
          System.out.println("Earphone already present");
      }
    }


    public void remove()
    {
        if(e!= null)
        {
            this.e=null;
            System.out.println("Earhone removed");
        }
        System.out.println("Earphone already removed");
    }
    



}