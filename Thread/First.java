package Thread;

import java.lang.Thread;


public class First{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start(); 
        System.out.println("Main thread is running...");
    }
}

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread is running...");
        for(int i=1;i<=10;i++){
            System.out.println("19 x " + i + " = " + (19 * i));
            
        }

    }
}