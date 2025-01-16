import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        int x;
        int y;
        System.out.println( "Enter first value");
        Scanner s = new Scanner (System.in);
        x= s.nextInt();
        System.out.println( "Enter second value");
        y= s.nextInt();
        System.out.println("Addition " + (x+y));
    }
}
