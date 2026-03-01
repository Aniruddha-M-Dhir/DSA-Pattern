import java.util.*;

public class IntHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("input " + n + "elements ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("enter no. elements to check ");

        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
        sc.close();

    }
}