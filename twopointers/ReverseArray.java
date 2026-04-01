package twopointers;

import java.util.Scanner;

public class ReverseArray {
    // public static void reverseArray(int[] arr, int n) {
    // int start = 0;
    // int end = n - 1;
    // while (start < end) {
    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;
    // start++;
    // end--;
    // }
    // }
    public static void reverseArray(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        System.out.println("enter num of elements ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("result");
        // int result = System.out.println(arr[n-2]);
        // int result = firstPass(arr, n);
        // int result = removeDuplicate(arr, n);
        // System.out.println(result);
        reverseArray(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}