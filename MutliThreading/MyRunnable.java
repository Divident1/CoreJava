package MutliThreading;

public class MyRunnable implements Runnable {

     @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Thread Running in :" +Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        MyRunnable task1= new MyRunnable();
        MyRunnable task2 = new MyRunnable();

        Thread t1= new Thread(task1);
        Thread t2 = new Thread(task2);


        t1.start();
        t2.start();
        
        System.out.println("Main mthod"+Thread.currentThread().getName());
    }

   
}
