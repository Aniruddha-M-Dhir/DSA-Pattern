import java.util.*;

public class FindMissingValue {
    public static int missingValue(int[] arr, int n) {
        int sum = 0;

        int realSum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

        }
        return realSum - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int result = missingValue(arr, n);
        System.out.println("missing is: ");
        System.out.println(result);

    }

}
