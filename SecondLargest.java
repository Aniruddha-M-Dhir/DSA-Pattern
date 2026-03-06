
// the second largest can be returned by sorting, and returning the n-2 element. 
// there is a better approach. since the brute will give O(NlogN)
// im still trying lol
import java.util.*;

public class SecondLargest {
    public static void sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static int largest(int[] arr, int n) {
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        return largest;
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
        sort(arr, n);
        System.out.println(arr[n - 2]);
    }

}
