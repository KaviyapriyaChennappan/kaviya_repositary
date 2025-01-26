import java.util.Scanner;

public class ArrayMaximumOfGivenNumbers
{
    public void compare(int[] arr) {
        int big = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        System.out.println(big);
    }
}
