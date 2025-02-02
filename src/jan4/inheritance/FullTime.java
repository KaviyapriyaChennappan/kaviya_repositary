package jan4.inheritance;

import java.util.Scanner;

public class FullTime extends Employee{
    Scanner s =new Scanner(System.in);
    public double calculate()
    {
        System.out.println("Please enter the below details \nYour ID");
        id = s.nextInt();
        System.out.println("Name");
        name = s.nextLine();
        System.out.println("Designation");
        designation=s.nextLine();
        System.out.println("Age");
        age=s.nextInt();
        System.out.println("Payrate");
        payRate=s.nextInt();
        return 40*payRate;
    }
}
