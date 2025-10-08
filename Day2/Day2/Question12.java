package Day2;

public class Question12 {
    public static void main(String[] args) {
        Course1 course1 = new Course1();
        course1.courseDetails();

        Course1 course2 = new Course1(101, "Java Programming", "Learn the basics of Java programming.");
        course2.courseDetails();

        Course1 course3 = new Course1(102, "Data Structures", "Introduction to data structures and algorithms.");
        course3.courseDetails();

    }
}

class Course1{
    int cId;
    String cName;
    String cDescription;

    Course1(){
        System.out.println("Course details are not specified.");
    }

    Course1(int cId, String cName, String cDescription){
        this.cId = cId;
        this.cName = cName;
        this.cDescription = cDescription;
    }

    public void courseDetails() {
        System.out.println("Course ID: " + this.cId);
        System.out.println("Course Name: " + this.cName);
        System.out.println("Course Description: " + this.cDescription);
    }

}
