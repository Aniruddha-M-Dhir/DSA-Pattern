import java.util.Scanner;

public class LinearSearch {
    // public static int linearSearch(int[] arr, int n, int x) {
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == x) {
    // return i;
    // }
    // }
    // return -1;

    // }
    public static int linearSearch(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("enter the number of elements in arr ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elemetns ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to check ");
        int x = sc.nextInt();
        int result = linearSearch(arr, n, x);
        System.out.println(result);
    }

}
