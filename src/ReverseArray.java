import java.util.Scanner;

public class ReverseArray
{
    public int[] input()
    {
        int a=10;
        int[] arr = new int[a];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 10 values");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public int[] reverse(int[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }

    public void output(int[] arr)
    {
        for (int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
