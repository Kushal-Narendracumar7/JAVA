package Day2;

//import calc.Calculator;

public class Question20 {
    public static void main(String[] args) {
        Calculator12 calc = new Calculator12();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Product: " + calc.product(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
        System.out.println("Modulus: " + calc.modulus(10, 5));
        System.out.println("Power: " + calc.power(2, 3));
    }}


class Calculator12 {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int product(int num1, int num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            return -1;
        }
        return num1 / num2;
    }
    public int modulus(int num1, int num2) {
        return num1 % num2;
    }
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

}

