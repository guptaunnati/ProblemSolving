package HackerRank.String;

// Given two strings of lowercase English letters,  and , perform the following operations:

// Sum the lengths of  and .
// Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
// Capitalize the first letter in  and  and print them on a single line, separated by a space.
// Input Format

// The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

// Output Format

// There are three lines of output:
// For the first line, sum the lengths of A and B.
// For the second line, write Yes if  A is lexicographically greater than B otherwise print No instead.
// For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

// Sample Input 0

// hello
// java
// Sample Output 0

// 9
// No
// Hello Java
// Explanation 0

// String A is "hello" and B is "java".

// A has a length of 5, and B has a length of 4; the sum of their lengths is 9 .
// When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, B is not greater than A and the answer is No.

// When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".
import java.util.Scanner;

public class Introduction {
    public static int toCompare(String s1, String s2) {
        if (s1.equals(s2)) {
            return 0;
        }
        int n = (s1.length() > s2.length()) ? s2.length() : s1.length();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            }
            if ((int) s1.charAt(i) > (int) s2.charAt(i)) {
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static void print(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) (s1.charAt(0) - 32));
        sb.append(s1.substring(1, s1.length()));
        sb.append(" ");
        sb.append((char) (s2.charAt(0) - 32));
        sb.append(s2.substring(1, s2.length()));
        System.out.println(sb);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        String A = sc.next();
        String B = sc.next();
        sc.close();

        // output
        System.out.println(A.length() + B.length());// length
        String ans = (toCompare(A, B) > 0) ? "Yes" : "No";
        System.out.println(ans);
        print(A, B);
    }
}
