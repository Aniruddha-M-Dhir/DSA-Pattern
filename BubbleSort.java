import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        int didSwap = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                System.out.println("0(n)");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of elements in array or length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println("sorted; ");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    arr[i]);
        }

    }

}
