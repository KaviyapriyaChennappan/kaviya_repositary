import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Scanner;

public class Ivr {
    public static void main(String[] args) {
        System.out.println("Please select any one of the below option");
        System.out.println("1: English");
        System.out.println("2: French");
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        if (x==1)
        {
            System.out.println(" 1. Internet  \n 2. Mobile \n 3. Technical support \n 4. Sales");
            int y = s.nextInt();
            if (y==1) {
                System.out.println("1. Billing \n 2. Change plan");
                int z = s.nextInt();
                switch (z)
                {
                    case 1:
                        System.out.println("Please find the billing information below");
                        break;
                    case 2:
                        System.out.println("Please find the available plans below");
                        break;
                    default:
                        System.out.println("Not a valid option \n exiting now \n please start again");
                        break;
                }
            }
            else if (y==2)
            {
                System.out.println("Please find the mobile information below");
            }
            else if (y==3)
            {
                System.out.println("Please find the Techn ical support  information below");
            }
            else if (y==4)
            {
                System.out.println("Please find the sales  information below");
            }
            else
            {
                System.out.println("Not a valid option \n exiting now \n please start again");
            }
        }
        else if (x==2)
        {
            System.out.println("I do not know French . Please select English");
        }
        else
        {
            System.out.println("Not a valid option \n exiting now \n please start again");
        }
    }
}
