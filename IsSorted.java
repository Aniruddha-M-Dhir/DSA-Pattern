import java.util.*;

//the order of sorting is ascending [1,4,5,6,7,9]
public class IsSorted {
    public static boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of elements in array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("result ");
        boolean result = isSorted(arr, n);
        System.out.println(result);
    }
}