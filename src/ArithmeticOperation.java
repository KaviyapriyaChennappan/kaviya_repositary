import java.util.Scanner;

public class ArithmeticOperation {
    public  void  addition()
    {
        int y;
        int z;
        int result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first value");
        y = s.nextInt();
        System.out.println("Enter the second value");
        z = s.nextInt();
        result = y + z;
        System.out.println("Addition of the given value is " + result);

    }
    public void subtraction()
    {
        int y;
        int z;
        int result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first value");
        y = s.nextInt();
        System.out.println("Enter the second value");
        z = s.nextInt();
        result = y - z;
        System.out.println("Subtraction of the given value is " + result);
    }
    public void multiplication()
    {
        int y;
        int z;
        int result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first value");
        y = s.nextInt();
        System.out.println("Enter the second value");
        z = s.nextInt();
        result = y * z;
        System.out.println("Multiplication of the given value is " + result);
    }
    public void division()
    {
        int y;
        int z;
        int result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first value");
        y = s.nextInt();
        System.out.println("Enter the second value");
        z = s.nextInt();
        result = y / z;
        System.out.println("Division of the given value is " + result);
    }
    public void modulo()
    {
        int y;
        int z;
        int result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first value");
        y = s.nextInt();
        System.out.println("Enter the second value");
        z = s.nextInt();
        result = y % z;
        System.out.println("Modulo of the given value is " + result);
    }
}
