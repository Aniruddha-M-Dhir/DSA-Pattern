// import java.util.*;

// public class SelectionSort {
//     public static void selectionSort(int arr[], int n) {
//         for (int i = 0; i <= n - 2; i++) {
//             int min = i;
//             for (int j = i; j <= n - 1; j++) {
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//                 // j is now mini

//             }
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of elements in the array ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();

//         }
//         selectionSort(arr, n);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }

// }

import java.util.*;

public class SelectionSort {
    public static void sort(int arr[], int n) {

        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
