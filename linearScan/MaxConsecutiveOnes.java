package linearScan;

import java.util.*;

public class MaxConsecutiveOnes {
    public static int maxOnes(int[] arr, int n) {
        int oneCount = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                oneCount++;
                max = Math.max(max, oneCount);

            } else {
                oneCount = 0;
            }

        }
        return max;
    }
    // public static int MaxOnes(int[] arr, int n) {
    // int oneCount = 0;
    // int max = 0;
    // for (int i = 1; i < n; i++) {
    // if (arr[i] == 1) {
    // oneCount++;
    // max = Math.max(max, oneCount);
    // } else {
    // oneCount = 0;
    // }

    // }
    // return max;
    // }

    // public static int maxConsecutiveOnes(int [] arr, int n){
    // int max = 0;
    // int oneCount = 0;
    // for (int i =0; i<n; i++){
    // if (arr[i] == 1){
    // oneCount++;
    // max = Math.max(max, oneCount);// takes maximum of both

    // }
    // else{
    // oneCount = 0;
    // }
    // }
    // return max;
    // }

}
