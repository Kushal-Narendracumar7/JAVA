

public class Question1{
    public static void main(String[] args) {
        Employee emp1 = new Employee(101,"Jemis","Digital Marketing",50000);
        emp1.display();
        System.out.println(); // Adding a line break for better readability
        System.out.println("---------------------------------");
        Employee emp2 = new Employee(102,"Kushal","Software Development",60000);
        emp2.display();
    }
}

class Employee{
    int empId;
    String empName;
    String deptName;
    double salary;

    Employee(int empId, String empName, String deptName, double salary){
        this.empId = empId;
        this.empName = empName;
        this.deptName = deptName;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Department Name: " + this.deptName);
        System.out.println("Salary: " + this.salary);
    }

}

