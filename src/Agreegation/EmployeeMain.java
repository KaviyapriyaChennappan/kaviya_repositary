package Agreegation;

public class EmployeeMain {
    public static void main(String[] args) {
        Address a1 = new Address(110, "ffr","fef","fdd" , "ffekjgv","fjkfhkgv");
        Address a2 = new Address(110, "ffr","fef","fdd" , "ffekjgv","fjkfhkgv");
        Address a3 = new Address(110, "ffr","fef","fdd" , "ffekjgv","fjkfhkgv");
        Address a4 = new Address(110, "ffr","fef","fdd" , "ffekjgv","fjkfhkgv");

        Employee e1 = new Employee(101, "kaviya", "a@a.com", 120000,a1);
        Employee e2 = new Employee(102, "priya", "p@a.com", 150000,a2);
        Employee e3 = new Employee(103, "mom", "m@a.com", 170000,a3);
        Employee e4 = new Employee(104, "dad", "d@a.com", 124000,a4);
        Employee e5 = new Employee(105, "bro", "b@a.com", 150000, new Address(110, "ffr","fef","fdd" , "ffekjgv","fjkfhkgv"));
        System.out.println(e1.getAddress());
    }
}
