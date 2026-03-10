import java.util.*;

public class FindUniqueNum {
    public static int uniqueNum(int[] arr, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i]; // if a^ a, 0 is ans, if not , returns num itself

        }
        return xor;

        // int curr = 0;
        // int count = 0;

        // for (int i = 0; i < n; i++) {
        // count = 0;
        // for (int j = 0; j < n; j++) {
        // if (arr[i] == arr[j]) {
        // count++;
        // }
        // }
        // if (count == 1) {
        // return arr[i];

        // }

        // }
        // return -1;

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
        int newLength = uniqueNum(arr, n);

        System.out.println("ans");
        System.out.println(newLength);
    }

}
