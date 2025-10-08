package Day2;

public  class Question2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(1,"Jemis","Surat");
        s1.display();
        System.out.println();
        System.out.println();
        Student2 s2 = new Student2(2,"Rohan","Mumbai");
        s2.display();
    }
}
class Student2{
    int rollNo;
    String name;
    String address;

    Student2(int rollNo , String name, String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

