package Thread;


public class ThreadJoin extends Thread {
    public void run(){
        for(int i=0;i<=10;i++){
            try{
                Thread.sleep(500);

            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }    

    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t3.start();
    }
}
