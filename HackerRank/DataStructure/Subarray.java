// Given an array of n integers, find and print its number of negative subarrays on a new line.

// Input Format

// The first line contains a single integer, n, denoting the length of array A=[a0, a1, ..., a(n-1)].
// The second line contains n space-separated integers describing each respective element, a(i), in array A.

// Constraints

// Output Format

// Print the number of subarrays of A having negative sums.

// Sample Input

// 5
// 1 -2 4 -5 1
// Sample Output

// 9
package HackerRank.DataStructure;

import java.util.*;

public class Subarray {
    public static void countSubArray(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        countSubArray(arr);
    }
}
