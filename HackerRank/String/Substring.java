// Given a string, s , and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end-1. You'll find the String class' substring method helpful in completing this challenge.

// Input Format

// The first line contains a single string denoting s.
// The second line contains two space-separated integers denoting the respective values of start and end.

// Output Format

// Print the substring in the inclusive range from start to end-1.

// Sample Input

// Helloworld
// 3 7
// Sample Output

// lowo
package HackerRank.String;

import java.util.Scanner;

public class Substring {
    public static void printSubstring(String s, int si, int ei){
        StringBuilder sb= new StringBuilder();
        for(int i=si; i<ei; i++){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        printSubstring(S, start, end);
    }
}
