package MutliThreading.JspiderThread;

public class ExtendsThreadClass extends Thread {
    public void run(){
        for(int i=0;i<3;i++)
        {
            System.out.println("my thread");
        }
    }


    public static void main(String[] args) {
        ExtendsThreadClass t= new ExtendsThreadClass();
        t.start();
    }



}
