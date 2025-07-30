import calc.Calculator;

public class Question20 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Product: " + calc.product(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
        System.out.println("Modulus: " + calc.modulus(10, 5));
        System.out.println("Power: " + calc.power(2, 3));
    }
}
