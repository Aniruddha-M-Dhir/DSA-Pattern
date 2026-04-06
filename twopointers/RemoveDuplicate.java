package twopointers;

import java.util.Scanner;

// tw0 pointer approach
//we take i = 0th index
// j = second index because the first one wiil obv be there
//if the index of i != j, then a non duplicate was found
// we increment the value of i
public class RemoveDuplicate {

    public static int removeDuplicate(int[] arr, int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;

            }

        }
        return i + 1;

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
        int newLength = removeDuplicate(arr, n);

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
