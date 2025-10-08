package Thread;


class Table{
    synchronized void printTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+ " x " + i + " = " + num*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Thread1 extends Thread{
    Table t1;

    Thread1(Table t1){
        this.t1 = t1;
    }
    public void run(){
        t1.printTable(6);
    }
}

class Thread2 extends Thread{
    Table t2;
    Thread2(Table t2){
        this.t2 = t2;
    }

    public void run(){
        t2.printTable(5);
    }
}


public class Synchronized{
    public static void main(String[] args) {
        
        Table t = new Table();
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);

        t1.start();
        t2.start();

    }
}