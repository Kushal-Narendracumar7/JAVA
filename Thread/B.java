package Thread;

public class B extends Thread {
    public void run(){
        System.out.println("Thread B");
        System.out.println(" i in Thread B");
        for(int i=0;i<5;i++){
            System.out.println("i = "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        System.out.println("Thread B is completed");
    }
    
}
