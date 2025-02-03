package encapsulation;

public class Studentmain {
    public static void main(String[] args) {
Student s = new Student(101,"kaviya" , "Java");
        System.out.println("before\n" + s);
        s.setName("Krish");
        System.out.println("after\n"+s);

    }
}
