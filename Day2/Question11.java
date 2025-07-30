import swap_pkg.Swap;


public class Question11 {
    public static void main(String[] args) {
        Swap swap = new Swap(5, 10);
        System.out.println("Before swap: a = " + swap.a + ", b = " + swap.b);
        swap.swapValues();
        System.out.println("After swap: a = " + swap.a + ", b = " + swap.b);

    }
}
