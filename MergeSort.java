// import java.util.*;

// public class MergeSort {
//     // merge funtion
//     public static void merge(int[] arr, int low, int mid, int high) {

//         ArrayList<Integer> temp = new ArrayList<>();

//         int left = low; // index 0 of first half of array
//         int right = mid + 1; // index 0 of the second half of array

//         // Merge the two sorted array
//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;

//             } else {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }

//         // remaining elements of left half
//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }

//         // remaining elements of right half
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }

//         // put temp to original array
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }

//     }

//     // recursive funtion
//     public static void mS(int[] arr, int low, int high) {
//         if (low >= high) {
//             return;
//         }
//         int mid = (low + high) / 2;

//         mS(arr, low, mid);
//         mS(arr, mid + 1, high);
//         merge(arr, low, mid, high);
//     }

//     // main mergesort funtion
//     public static void mergeSort(int[] arr, int n) {
//         mS(arr, 0, n - 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of elements:");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         mergeSort(arr, n);

//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }

// }

import java.util.*;

public class MergeSort{
    public static void merge(int [] arr, int low, int mid,int high){

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low ;
        int right = mid+1;

        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                    right++;
                }

            }

                
        
        while (left <= mid){
            temp.add(arr[left]);
            left++;

        }
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i =low; i <= high; i++){
            arr[i] = temp.get(i-low);
        }

    }

    public static void mS(int [] arr, int low, int high){
        if (low >= high){
            return;
        }
        int mid = (low + high) / 2;
        mS(arr, low, mid);
        mS(arr, mid+1, high);
        merge(arr, low , mid, high);

            

    }
    public static void mergeSort(int [] arr, int n){
        mS(arr, 0, n - 1);

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter num of array");
            int n = sc.nextInt();
            int [] arr = new int [n];
            for (int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            mergeSort(arr,n);
            for (int i = 0; i<n; i++){
                System.out.println(arr[i]);
            }

        

        }
    
    
    
    
}
