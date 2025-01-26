import java.util.Scanner;
public class ArryaSmallestOfGivenNumbers {
    public static void main(String[] args) {
            int arr[] = new int[10];
            Scanner s = new Scanner(System.in);
            for (int i=0 ; i<arr.length ; i++)
            {
                arr[i]= s.nextInt();
            }
        int big =arr[1];
            for (int i=0 ; i<arr.length ; i++)
            {
                if (big > arr[i])
                {
                    big= arr[i];
                }
            }
            System.out.println(big);
        }
    }



