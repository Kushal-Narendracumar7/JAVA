public class Question17 {
    public void swap(int num1 , int num2){
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
    public static void main(String[] args) {
        Question17 swapper = new Question17();
        
        swapper.swap(5, 3);
        swapper.swap(10, 20);
        swapper.swap(15, 25);
    }
}
