public class Question10 {
    public static void main(String[] args) {
        
        Manager manager = new Manager();
        manager.empDetails();
        manager.empSalary();

        HR hr = new HR();
        hr.empDetails();
        hr.empSalary();

    }
}

abstract class Employee{
    abstract void empDetails();
    abstract void empSalary();

}

class Manager extends Employee {
    @Override
    void empDetails() {
        System.out.println("Manager Details: Responsible for overseeing operations.");
    }

    @Override
    void empSalary() {
        System.out.println("Manager Salary: $80,000");
    }
}

class HR extends Employee {
    @Override
    void empDetails() {
        System.out.println("HR Details: Manages employee relations and recruitment.");
    }

    @Override
    void empSalary() {
        System.out.println("HR Salary: $60,000");
    }
}
