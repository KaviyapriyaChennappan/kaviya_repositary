package jan4.inheritance;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please choose from the below option\n1 for Full time \n2 for Part time \n3 for Contractor");
        int i = s.nextInt();
        double  salary;
        if (i==1)
        {
            FullTime f =new FullTime();
            salary = f.calculate();
            System.out.println("your ç salary is \n " +salary);
        }
        else if (i==2)
        {
           PartTime p =new PartTime();
            salary = p.calculate();
            System.out.println("your weekly salary is \n " +salary);
        }
        else if (i==3)
        {
            Contract c =new Contract();
            salary = c.calculate();
            System.out.println("your weekly salary is \n " +salary);
        }
        else
        {
            System.out.println("Please choose an valid option");
        }




    }
}
