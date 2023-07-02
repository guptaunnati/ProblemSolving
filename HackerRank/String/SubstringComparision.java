// Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

// Function Description

// Complete the getSmallestAndLargest function in the editor below.

// getSmallestAndLargest has the following parameters:

// string s: a string
// int k: the length of the substrings to find
// Returns

// string: the string ' + "\n" + ' where and are the two substrings
// Input Format

// The first line contains a string denoting .
// The second line contains an integer denoting .

// Sample Input 0
// welcometojava
// 3

// Sample Output 0
// ava
// wel
package HackerRank.String;

import java.util.Scanner;

public class SubstringComparision {
    // public static int compare(String s1, String s2){
    //     if (s1.equals(s2)) {
    //             return 0;
    //         }
    //         int n = (s1.length() > s2.length()) ? s2.length() : s1.length();
    //         for (int i = 0; i < n; i++) {
    //             if (s1.charAt(i) == s2.charAt(i)) {
    //                 i++;
    //             }
    //             if ((int) s1.charAt(i) > (int) s2.charAt(i)) {
    //                 return 1;
    //             } else {
    //                 return -1;
    //             }
    //         }
    //         return -1;
    // }
        public static String getSmallestAndLargest(String s, int k) {
            String smallest =s.substring(0, k);
            String largest =s.substring(0, k);
            
            for(int i=1; i<=s.length()-k;i++){
                String h=s.substring(i, i+k );
                smallest = h.compareTo(smallest)>0? smallest: h;
                largest = h.compareTo(largest)>0? h: largest;
            }
            return smallest + "\n" + largest;
        }
    
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
}
