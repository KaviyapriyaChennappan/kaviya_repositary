import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int y= 1;
        for (int i=1; i<=x ;i++ )
        {
            y = y*i;
        }
        System.out.println(y);
    }
}
