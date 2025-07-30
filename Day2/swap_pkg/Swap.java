package swap_pkg;

public class Swap {
    public int a, b;
    public Swap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swapValues() {
        int temp = a;
        a = b;
        b = temp;
    }
}
