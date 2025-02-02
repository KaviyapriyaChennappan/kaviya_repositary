package jan4.inheritance;

import java.util.Scanner;

public class PartTime extends Employee {
    Scanner s = new Scanner(System.in);

    public double calculate() {
        System.out.println("Please enter the below details \nYour ID");
        id = s.nextInt();
        System.out.println("Name");
        name = s.nextLine();
        System.out.println("Designation");
        designation = s.nextLine();
        System.out.println("Age");
        age = s.nextInt();
        System.out.println("Payrate");
        payRate = s.nextInt();
        System.out.println("Number of hours worked this week");
        numberOfHours = s.nextInt();
        if (numberOfHours < 15)
        {
            return numberOfHours * payRate;
        } else
        {
            System.out.println("worked more than expected. Contact manager to review and update salary");
            return 0.0;
        }
    }
}
