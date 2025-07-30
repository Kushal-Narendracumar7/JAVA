package calc;

public class Calculator {
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
