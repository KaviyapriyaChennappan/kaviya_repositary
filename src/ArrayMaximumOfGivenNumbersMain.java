import java.util.Scanner;

public class ArrayMaximumOfGivenNumbersMain
{
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
        ArrayMaximumOfGivenNumbers a = new ArrayMaximumOfGivenNumbers();
        a.compare(arr);
    }
}
