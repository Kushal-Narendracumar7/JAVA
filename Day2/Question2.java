public  class Question2 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Jemis","Surat");
        s1.display();
        System.out.println();
        System.out.println();
        Student s2 = new Student(2,"Rohan","Mumbai");
        s2.display();
    }
}
class Student{
    int rollNo;
    String name;
    String address;

    Student(int rollNo , String name, String address){
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

