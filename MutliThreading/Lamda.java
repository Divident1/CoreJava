package MutliThreading;

public class Lamda {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("Thread is running"+Thread.currentThread().getName());
        });
         Thread t2 = new Thread(()->{
            System.out.println("Thread is running"+Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
    }
}
