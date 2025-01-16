import java.util.Scanner;

public class PrintnNumbers {
    public static void main(String[] args) {
        System.out.println("Enter n value");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = 1;
        while (x >=y)
        {
            System.out.println(y);
            y++;
        }
    }
}
