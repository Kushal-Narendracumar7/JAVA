public class Question8 extends Calculator {
    public static void main(String[] args) {
        Question8 calculator = new Question8();
        calculator.add(10, 5);
        calculator.subtract(10, 5);
        calculator.multiply(10, 5);
        calculator.divide(10, 5);
        calculator.divide(10, 0); 
    }

    @Override
    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + ((double)a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
    
}

abstract class Calculator {
    abstract void add(int a, int b);
    abstract void subtract(int a, int b);
    abstract void multiply(int a, int b);
    abstract void divide(int a, int b);
}
