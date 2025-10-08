public class DaemonThread extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Current Thread is Daemon");
        }else{
            System.out.println("Current Thread is User Thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread();
        DaemonThread d2 = new DaemonThread();
        d1.setName("D1");
        d2.setName("D2");
        d1.setDaemon(true);
        d2.start();
        d1.start();       

    }
}