public class Question18 {
    public String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        Question18 checker = new Question18();
        
        System.out.println("Number 4 is: " + checker.checkEvenOdd(4));
        System.out.println("Number 7 is: " + checker.checkEvenOdd(7));
        System.out.println("Number 0 is: " + checker.checkEvenOdd(0));
        System.out.println("Number -3 is: " + checker.checkEvenOdd(-3));
    }
}
