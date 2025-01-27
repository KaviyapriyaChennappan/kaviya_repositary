import java.util.Scanner;
public class ArryaSmallestOfGivenNumbers {
public int compare(int[] arr)
{
    int small = arr[1];
    for (int i = 0; i < arr.length; i++) {
        if (small > arr[i]) {
            small = arr[i];
        }
    }
return small;
}
    }



