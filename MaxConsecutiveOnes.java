import java.util.*;

public class MaxConsecutiveOnes {
    public static int MaxOnes(int[] arr, int n) {
        int oneCount = 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == 1) {
                oneCount++;
                max = Math.max(max, oneCount);
            } else {
                oneCount = 0;
            }

        }
        return max;
    }

}
