public class Question9 {
    public static void main(String[] args) {
        
        Volume v = new Volume(10,7, 2);
        System.out.println("Area of the rectangle: " + v.calculateArea());
        System.out.println("Volume of the cuboid: " + v.calculateVolume());
    }

}

class Area{
    int length;
    int breadth;
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int calculateArea() {
        return length * breadth;
    }
}

class Volume extends Area{
    int height;
    Volume(int length, int breadth , int height){
        super(length,breadth);
        this.height = height;
    }
    public int calculateVolume(){
        return super.calculateArea() * height;

    }
}