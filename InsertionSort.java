// import java.util.Scanner;

// public class InsertionSort {
//     public static void insertionSort(int[] arr, int n) {
//         for (int i = 0; i <= n - 1; i++) {
//             int j = i;
//             while (j > 0 && arr[j - 1] > arr[j]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j - 1];
//                 arr[j - 1] = temp;
//                 j--;

//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the num of elements in array or length: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         insertionSort(arr, n);
//         System.out.println("sorted; ");
//         for (int i = 0; i < n; i++) {
//             System.out.println(
//                     arr[i]);
//         }

//     }

// }

import java.util.*;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = j;
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enterthe elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
        System.out.println(" array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
