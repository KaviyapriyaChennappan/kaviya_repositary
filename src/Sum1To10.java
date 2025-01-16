import java.util.Scanner;

public class Sum1To10 {
    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y=2;
        int z=1;
        while ( x>=y)
        {
            z= z+y;
            y++;
        }
        System.out.println(z);
    }
}
