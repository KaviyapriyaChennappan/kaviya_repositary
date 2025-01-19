
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        String a;
        do
        {
        System.out.println("Please select any one of the below option");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Modulo");
        System.out.println("0: Exit");
        Scanner s1 = new Scanner(System.in);
        int x= s1.nextInt();
        ArithmeticOperation arithmeticoperation = new ArithmeticOperation();
        switch (x)
           {
            case 1:
                do
                {
                    arithmeticoperation.addition();
                    System.out.println("\n\n\nDo you wish to continue ? \n If yes , press y \n To go to main menu , press m\n to exit , press any other key");
                    a = s1.next();
                }while ( a.equals ("y"));
                break;
            case 2:
                do
                {
                    arithmeticoperation.subtraction();
                    System.out.println("\n\n\nDo you wish to continue ? \n If yes , press y \n To go to main menu , press m\n to exit , press any other key");
                    a = s1.next();
                }while ( a.equals ("y"));
                break;
            case 3:
                do
                {
                    arithmeticoperation.multiplication();
                    System.out.println("\n\n\nDo you wish to continue ? \n If yes , press y \n To go to main menu , press m\n to exit , press any other key");
                    a = s1.next();
                }while ( a.equals ("y"));
                break;
            case 4:
                do
                {
                    arithmeticoperation.division();
                    System.out.println("\n\n\nDo you wish to continue ? \n If yes , press y \n To go to main menu , press m\n to exit , press any other key");
                    a = s1.next();
                }while ( a.equals ("y"));
                break;
            case 5:
                do
                {
                    arithmeticoperation.modulo();
                    System.out.println("\n\n\nDo you wish to continue ? \n If yes , press y \n To go to main menu , press m\n to exit , press any other key");
                    a = s1.next();
                }while ( a.equals ("y"));
                break;
            case 0:
                System.out.println("Have a great day ... bye");
                a="x";
                break;
            default:
                System.out.println("please chose a value on the above list. Please try again ");
                a="x";
                break;
            }
        }while ( a.equals ("m"));
    }

}
