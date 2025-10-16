package ArrayObject;

import java.util.Scanner;

class Bus {
    String busStation;
    int ticketPrice;
    String typeOfService;
    public Bus(String busStation, int ticketPrice, String typeOfService) {
        this.busStation = busStation;
        this.ticketPrice = ticketPrice;
        this.typeOfService = typeOfService;
    }
    @Override
    public String toString() {
        return "Bus [busStation=" + busStation + ", ticketPrice=" + ticketPrice + ", typeOfService=" + typeOfService
                + "]";
    }
}



    public class BusDriver{
        public static void main(String[] args) {
            
            Bus[] b1= new Bus[2];
            Scanner sc= new Scanner(System.in);



           for(int i=0;i<b1.length;i++)
           {
             b1[i] = new Bus(sc.next(), sc.nextInt(), sc.next());
             System.out.println(1+i+" Bus Booking booked");
           }





           for(int i=0;i<b1.length;i++)
           {
            System.out.println(b1[i].toString());
           }


           int priceSearch= sc.nextInt();
           boolean istrue=false;

           for(int i =0;i<b1.length;i++)
           {
            if(b1[i].ticketPrice==priceSearch)
            {
                System.out.println(b1[i].toString());
                istrue=true;
                break;
            }else{
                System.out.println("you haven't enter the correct ticketPrice"+priceSearch);
            }
           }


      /*      int index = sc.nextInt();
           System.out.println(b1[index].toString()); */




            
        
        } 
    }
