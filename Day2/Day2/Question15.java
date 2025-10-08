package Day2;


public class Question15 {
    public static void main(String[] args) {
        // Default constructor
        CourseDetails course1 = new CourseDetails();
        course1.display();
        // Parameterized constructor
        System.out.println("-----------------------------------------------------");
        CourseDetails course2 = new CourseDetails(102, "Python Programming", "4 Months");
        course2.display();
        System.out.println("-----------------------------------------------------");
        CourseDetails course3 = new CourseDetails(103, "Web Development", "6 Months");
    }
}

class CourseDetails{
    int cId = 101;
    String cName = "Java Programming";
    String cDuration = "3 Months";

    CourseDetails(){
        
    }

    CourseDetails(int id, String name, String duration){
        this.cId = id;
        this.cName = name;
        this.cDuration = duration;
        
    }
    void display(){
        System.out.println("Course ID: " + cId);
        System.out.println("Course Name: " + cName);
        System.out.println("Course Duration: " + cDuration);
    }
}