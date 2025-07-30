public class Question12 {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.courseDetails();

        Course course2 = new Course(101, "Java Programming", "Learn the basics of Java programming.");
        course2.courseDetails();

        Course course3 = new Course(102, "Data Structures", "Introduction to data structures and algorithms.");
        course3.courseDetails();

    }
}

class Course{
    int cId;
    String cName;
    String cDescription;

    Course(){
        System.out.println("Course details are not specified.");
    }

    Course(int cId, String cName, String cDescription){
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
