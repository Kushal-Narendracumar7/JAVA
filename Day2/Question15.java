public class Question15 {
    public static void main(String[] args) {
        // Default constructor
        CourseDetails course1 = new CourseDetails();

        // Parameterized constructor
        CourseDetails course2 = new CourseDetails(102, "Python Programming", "4 Months");
    }
}

class CourseDetails{
    int cId = 101;
    String cName = "Java Programming";
    String cDuration = "3 Months";

    CourseDetails(){
        System.out.println("Course ID: " + cId);
        System.out.println("Course Name: " + cName);
        System.out.println("Course Duration: " + cDuration);
    }

    CourseDetails(int id, String name, String duration){
        this.cId = id;
        this.cName = name;
        this.cDuration = duration;
        System.out.println("Course ID: " + cId);
        System.out.println("Course Name: " + cName);
        System.out.println("Course Duration: " + cDuration);
    }
}