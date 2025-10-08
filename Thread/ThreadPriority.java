public class ThreadPriority {
    

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.setPriority(3);
        t2.setPriority(7);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        
        public void run() {
            System.out.println(getName() + " priority: " + getPriority());
        }
    }