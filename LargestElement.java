import java.util.*;
// // Largest element in an array
// class Solution {
// public int largestElement(int[] nums) {
// int largest = nums[0];
// for (int i = 0; i< nums.length; i++){
// if (nums[i] > largest){
// largest = nums[i];

// }
// }
// return largest;

// }
// }
public class LargestElement {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(";eneter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = largest(arr, n);
        System.out.println(result);

    }

}