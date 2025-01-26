import java.util.Scanner;

public class ArrayFruits {
    public static void main(String[] args) {
        String[] arr = new String[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
