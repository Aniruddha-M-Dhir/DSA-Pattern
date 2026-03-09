import java.util.*;

public class MoveZeroesToEnd {
    // public static void noZero(int[] arr, int n) {
    // int i = 0;
    // for (int j = 0; j < n; j++) {
    // if (arr[j] != 0) {
    // arr[i] = arr[j];
    // i++;
    // }
    // }
    // // to just remove zeroes, dont write this part
    // while (i < n) {
    // arr[i] = 0;
    // i++;
    // }
    // }
    public static void noZero(int[] arr, int n) {
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }

        }
        while (i < n) {
            arr[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER   NUM ELEMETNS");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("result ");
        noZero(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
