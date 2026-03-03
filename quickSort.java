
// quicksort
// rules:
// 1. pick a pivot and put it in its correct place.
// 2. now, put smaller elements to left of pivot, and larger elements to right
// of pivot.
// repeat for left side of pivot and right side of pivot
import java.util.*;

public class Quicksort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }

            while (j >= low + 1 && arr[j] >= pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);

        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num elemetns");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        System.out.println("sorted array ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        // for (int num : arr) {
        // System.out.println(num + " ");
        // }
    }

}
