import java.util.Scanner;

public class TimeTable {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String hello=sc.nextLine();

        switch(hello)
        {

            case "Monday","Wednesday":{
                System.out.println("Java");
                break;
            }
            case "Tuesday", "Saturday":{
                System.out.println("SQL");
                break;

            }
           
            case "Thrusday":{
                System.out.println("Web Tech");
          break;
            }
               case "Friday":{
                System.out.println("Apit");
                break;
            }
       
            default:
            {
                System.out.println("Take rest bhaii");
                break;
            }

            
        }
    }
}
