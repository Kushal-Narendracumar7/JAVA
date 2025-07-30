public class Question14 {
    public static void main(String[] args) {
        Circle circle = new CircleImpl();
        circle.area(5);

        Rectangle rectangle = new RectangleImpl();
        rectangle.area(4, 6);
        
    }
}

interface Circle{
    void area(int radius);
}
interface Rectangle{
    void area(int length, int breadth);
}

class CircleImpl implements Circle {
    public void area(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class RectangleImpl implements Rectangle {
    public void area(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}