import java.sql.SQLOutput;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i=0; i<=100 ; i++)
        {
            if (i%5==0)
            {
                System.out.println("Pragra");
                continue;
            }
            System.out.println(i);
        }

    }
}
