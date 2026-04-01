package arrayManipulation;

import java.util.*;

public class FindMissingValue {
    // public static int missingValue(int[] arr, int n) {
    // int sum = 0;

    // int realSum = n * (n + 1) / 2;

    // for (int i = 0; i < n; i++) {
    // sum = sum + arr[i];

    // }
    // return realSum - sum;
    // }
    // public static int missingValue(int[] arr, int n) {
    // int realSum = n * (n + 1) / 2;
    // int sum = 0;
    // for (int i = 0; i < n; i++) {
    // sum = sum + arr[i];
    // }
    // return realSum - sum;
    // }

    public static int missingValue(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum = arr[i] + actualSum;
        }
        return sum - actualSum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values");
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int result = missingValue(arr, n);
        System.out.println("missing is: ");
        System.out.println(result);

    }

}
