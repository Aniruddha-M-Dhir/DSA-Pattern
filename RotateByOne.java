import java.util.Scanner;

public class RotateByOne {
    public static void rotateByOne(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];

        }
        arr[n - 1] = temp;

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
        rotateByOne(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
