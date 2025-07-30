public class Question5 {
    public static void main(String[] args) {
        Square square = new Square();
        Reactance reactance = new Reactance();

        square.area();
        reactance.area();
    }
}

class Shape {
    public void area() {
        System.out.println("Calculating area of a shape");
    }
}

class Square extends Shape {
    @Override
    public void area() {
        int side = 5;
        System.out.println("Area of Square: " + (side * side));
    }
}

class Reactance extends Shape {
    @Override
    public void area() {
        int length = 6, width = 4;
        System.out.println("Area of Rectangle: " + (length * width));
    }
}