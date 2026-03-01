
// //assuming all the chars are lower case. there are 26 alphabets so, o->25 index.
// // ASCII of 'a' = 97 , 'b' = 98 ......
// //ASCII o
// import java.util.*;

// public class CharHashing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter string ");
//         String s = sc.next();

//         int[] hash = new int[26];
//         for (int i = 0; i < s.length(); i++) {
//             hash[s.charAt(i) - 'a']++;

//         }
//         int q = sc.nextInt();
//         while (q-- > 0) {
//             char c = sc.next().charAt(0);
//             System.out.println(hash[c = 'a']);
//         }
//         sc.close();

//     }

// }

import java.util.*;

public class CharHashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        String s = sc.next();

        // Precompute frequency for lowercase letters a–z
        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // Number of queries
        int q = sc.nextInt();

        while (q-- > 0) {
            char c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']);
        }

        sc.close();
    }
}
