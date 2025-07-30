public class Question16 {
    public int add(int num1 , int num2){return num1 + num2;}

    public int subtract(int num1 , int num2){return num1 - num2;}

    public int product(int num1 , int num2){return num1 * num2;}

    public int divide(int num1 , int num2){return num1 / num2;}

    public int modulus(int num1 , int num2){return num1 % num2;}

    public int power(int base , int exponent){
        int result = 1;
        for(int i=0;i<exponent;i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Question16 calculator = new Question16();
        
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Product: " + calculator.product(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
        System.out.println("Modulus: " + calculator.modulus(5, 3));
        System.out.println("Power: " + calculator.power(2, 3));
    }


}
