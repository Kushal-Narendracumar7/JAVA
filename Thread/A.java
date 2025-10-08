package Thread;

public class A extends Thread {
    public void run() {
        System.out.println("Thread A is running...");
        System.out.println("i in Thread A");

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread A Completed");
    }
}
