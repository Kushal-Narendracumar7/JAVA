package Day2;


public class Question7 {
    public static void main(String[] args) {
        Calculator7 calculator = new Calculator7();
        calculator.add(10, 5);
        calculator.subtract(10, 5);
        calculator.multiply(10, 5);
        calculator.divide(10, 5);
        calculator.divide(10, 0); 
    }
}

interface performOperations{
    void add(int a, int b);
    void subtract(int a, int b);
    void multiply(int a, int b);
    void divide(int a, int b);
}
class Calculator7 implements performOperations {
    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + ((double)a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}