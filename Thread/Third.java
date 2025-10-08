package Thread;

public class Third {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        Thread.yield();
        try{
            Thread.sleep(4000);
        }catch(Exception e){
            e.printStackTrace();
        }
        t2.start();
        System.out.println("Min thread End");
    }
}


