import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        s= sc.nextLine();
        System.out.println("LOWER_CASE " + s.toLowerCase());
        System.out.println("LENGTH "+s.length());
        System.out.println("UPPERCASE "+s.toUpperCase());
        System.out.println("CHAR AT "+ s.charAt(0));
        System.out.println("SUBSTRING "+ s.substring(0,2));
        char []  chars = s.toCharArray();
        String concat  = s.concat(" Welcome!");
        System.out.println(concat);
        System.out.println("REPLACE " + s.replace("a" , "k"));
    }
}
