package COLLECTION.LIST.ARRAYLIST.BtmProgram;

import java.util.ArrayList;

class VehicleCar{
    String name;
      String model;
      double price;
      @Override
      public String toString() {
        return "VehicleCar [name=" + name + ", model=" + model + ", price=" + price + "]";
      }
      public VehicleCar(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
      }

      
      
}


class VehicleBike{
    String name;
    String model;
    double price;
    @Override
    public String toString() {
        return "VehicleBike [name=" + name + ", model=" + model + ", price=" + price + "]";
    }
    public VehicleBike(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    
    
}


public class ArrayListObject {
public static void main(String[] args) {
    
    ArrayList vlist= new ArrayList();

    vlist.add(new VehicleCar("Honda", "V19", 10));
    vlist.add(new VehicleCar("Hyndai", "V29", 20));
    vlist.add(new VehicleBike("Scoote", "Desi", 20));
    vlist.add(new VehicleBike("Splendor", "dja3", 90));

    showDetail(vlist);
}

public static void showDetail(ArrayList vlist)
{
    for(int i=0;i<=vlist.size()-1;i++)
    {
        System.out.println(vlist.get(i));
        System.out.println("--------------");
    }
}

   
}
