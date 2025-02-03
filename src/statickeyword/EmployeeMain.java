package statickeyword;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Kaviya", 234596.43 ,"Full Stack Developer");
        Employee e2 = new Employee(102, "priya", 134596.43 ,"Developer");
        Employee e3 = new Employee(103, "camlin", 34596.43 ,"Assitant ");
        e1.printEmployee();
        System.out.println("\n");
        e2.printEmployee();
        System.out.println("\n");
        e3.printEmployee();



    }
}
