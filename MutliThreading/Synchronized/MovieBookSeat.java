package MutliThreading.Synchronized;


public class MovieBookSeat extends Thread{

static BookSeats sb;

int seats;


    @Override
    public void run()
    {
        sb.SeatBooking(seats);
    }
    

public static void main(String[] args) {
    sb= new BookSeats();

    MovieBookSeat user1= new MovieBookSeat();
    user1.seats=4;
    user1.start();
    MovieBookSeat user2 = new MovieBookSeat();
    user2.seats=3;
    user2.start();
}

}