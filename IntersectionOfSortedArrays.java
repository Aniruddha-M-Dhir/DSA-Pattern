import java.util.*;

public class IntersectionOfSortedArrays {
    public static List<Integer> intersection(int[] arr1, int n, int[] arr2, int m) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.println("Enter size of first array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter elements of first array (sorted):");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.println("Enter size of second array:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter elements of second array (sorted):");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> result = intersection(arr1, n, arr2, m);

        System.out.println("Intersection:");
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}