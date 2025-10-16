package MutliThreading.Synchronized;

public class BookSeats {
    int totalSeats=10;

   synchronized public void SeatBooking(int seats)
    {
        if(totalSeats>seats)
        {
            System.out.println("Seats have been booked succesffully");
            totalSeats -=seats;
            System.out.println("Total Seats left"+totalSeats);
        }
        else{
            System.out.println("There is no Seats left to book");
        }
    }
}


