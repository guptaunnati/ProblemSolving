// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

// Given a string A, print Yes if it is a palindrome, print No otherwise.

// Constraints
//  A will consist at most 50 lower case english letters.

// Sample Input
// madam

// Sample Output
// Yes
package HackerRank.String;

import java.util.Scanner;

public class Reverse {
    public static boolean isPallindrone(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        /* Enter your code here. Print output to STDOUT. */
        if(isPallindrone(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
