// import java.util.Scanner;
// import java.util.Arrays;

// public class Main {
// public static boolean isPalindrome(int i, int[] arr, int n) {
// if (i >= n) {
// return true;
// }
// if (arr[i] != arr[n]) {
// return false;
// }
// return isPalindrome(i + 1, arr, n - 1);

// }

// // public static void revArr(int[] arr, int i, int n) {
// // if (i >= n) {

// // return;
// // }
// // // swap(arr[i], arr[n]);
// // int temp = arr[i];
// // arr[i] = arr[n];
// // arr[n] = temp;
// // revArr(arr, i + 1, n - 1);

// // }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.print("enter arr length ");
// int n = sc.nextInt();
// System.out.println("enter number of elements in array: ");
// int[] arr = new int[n];
// System.out.println("enter " + n + "elements ");
// for (int i = 0; i < n; i++) {

// arr[i] = sc.nextInt();
// }
// boolean result = isPalindrome(0, arr, n - 1);
// System.out.println(result);

// // int[] arr = new int[n];

// // for (int i = 0; i < n; i++) {
// // System.out.println("enter array elements: ");

// // arr[i] = sc.nextInt();

// // }
// // revArr(arr, 0, n - 1);
// // System.out.println("reversed array: ");
// // System.out.println(Arrays.toString(arr));

// }

// }

// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int[] arr = new int[n];

// // Input array
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// // Precompute frequency (hashing)
// int[] hash = new int[13]; // same as int hash[13] = {0};

// for (int i = 0; i < n; i++) {
// hash[arr[i]] += 1;
// }

// int q = sc.nextInt();

// while (q-- > 0) {
// int number = sc.nextInt();
// System.out.println(hash[number]);
// }

// sc.close();
// }
// }
