package twopointers;

import java.util.*;

public class unionOfArrays {
    public static List<Integer> arrayIntersect(List<Integer> arr1, int n, List<Integer> arr2, int m) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;

            } else if (arr2.get(j) < arr1.get(i)) {
                j++;
            } else {
                ans.add(arr1.get(i));
                i++;
                j++;

            }
        }
        return ans;

    }
}
