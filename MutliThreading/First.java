package MutliThreading;
public class First extends Thread {

    public void run(){
        System.out.println("Task is running"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        First t1= new First();
        First t2 = new First();


        t1.start();
        t2.start();
        System.out.println("Main Thread:"+Thread.currentThread().getName());

    }
}
