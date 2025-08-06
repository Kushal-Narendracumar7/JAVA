package Thread;
import java.lang.Thread;

public class Second {
    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        Thread thread = new Thread(t2);
        thread.start();
        System.out.println("Main thread is running...");
        
    }
}


class Thread2 implements Runnable{
    public void run() {
        System.out.println("Thread is running...");

    }
}