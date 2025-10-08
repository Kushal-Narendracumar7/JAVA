package Thread;
import java.lang.Thread;

public class Second {
    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        Thread thread = new Thread(t2,"Thread is Started");
        thread.start();
        // try{
        //     thread.join();                                                                                                                                                                                                                                                                                                       
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
        System.out.println("Thread Name : "+thread.getName());
    }
}


class Thread2 implements Runnable{
    public void run() {
        System.out.println("Thread is running...");
    }
}