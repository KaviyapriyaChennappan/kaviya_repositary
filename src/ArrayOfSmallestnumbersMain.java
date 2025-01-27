import java.util.Scanner;

public class ArrayOfSmallestnumbersMain {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        ArryaSmallestOfGivenNumbers a = new ArryaSmallestOfGivenNumbers();
        int small = a.compare(arr);
        System.out.println(small);
    }
}
