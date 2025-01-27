import java.util.Scanner;

public class ReverseArrayWhile {
    public static void main(String[] args)
    {
            int a=7;
            int[] arr = new int[a];
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 10 values");
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = s.nextInt();
            }
            int start = 0;
            int end = arr.length-1;
            while (start < end)
            {
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        for (int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

}
