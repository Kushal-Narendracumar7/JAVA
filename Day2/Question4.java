public class Question4 {
    public static void main(String[] args) {
        Student jemis = new Student(39,"Jemis Shihora","Masters Of Science in Information Technology");
        jemis.displayUniversityInfo();
        jemis.displayDepartmentInfo();
        jemis.display();
        System.out.println("--------------------------------------------------");
        Student ankit = new Student(40,"Ankit Patel","Masters Of Science in Information Technology");
        ankit.displayUniversityInfo();
        ankit.displayDepartmentInfo();
        ankit.display();
        
    }
}
class University{
    String uniName = "The Maharaja SayajiRao University of Baroda";
    String uniLocation = "Vadodara, Gujarat, India";
    int uniEstablishedYear = 1949;

    void displayUniversityInfo() {
        System.out.println("University Name: " + uniName);
        System.out.println("University Location: " + uniLocation);
        System.out.println("University Established Year: " + uniEstablishedYear);
    }

}

class Department extends University {
    String deptName = "Computer Science and Engineering";
    String deptHead = "Dr. Kushal ";
    int deptEstablishedYear = 1995;

    void displayDepartmentInfo() {
        System.out.println("University Name: " + uniName);
        System.out.println("University Location: " + uniLocation);
        System.out.println("University Established Year: " + uniEstablishedYear);
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
        System.out.println("Department Established Year: " + deptEstablishedYear);
    }
}

class Student extends Department{
    int rollNo;
    String name;
    String course;

    Student(int rollNo , String name , String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    void display(){
        System.out.println("student Roll No : " + rollNo);
        System.out.println("Name of Student : " + name);
        System.out.println("Name of Course : " + course);
    }
}
