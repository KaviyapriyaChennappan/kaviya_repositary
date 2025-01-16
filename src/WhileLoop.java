import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter any desired multiplication details");
        Scanner s = new Scanner(System.in);
         int x = s.nextInt();
         int y =1;
         while (y<=10)
         {
             System.out.println( x + " * " + y + " = "   + x*y);
             y++;
         }
    }
}
