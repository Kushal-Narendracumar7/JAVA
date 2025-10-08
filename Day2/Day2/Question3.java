package Day2;

public class Question3 extends Calculator{
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator Program!");
        System.out.println(Calculator.add(5,3));
        System.out.println(Calculator.subtract(5,3));
        System.out.println(Calculator.multiply(5,3));
        System.out.println(Calculator.divide(30,3));
    }
    
}

class Calculator{
    public static int add(int a , int b){return a + b;}
    public static int subtract(int a , int b){return a - b;}
    public static int multiply(int a, int b){return a * b;}
    public static int divide(int a, int b){
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

}
