// Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.

// Input Format

// A single line containing a positive integer, .

// Constraints

// Output Format

// Print Weird if the number is weird; otherwise, print Not Weird.

// Sample Input 0

// 3
// Sample Output 0

// Weird
// Sample Input 1

// 24
// Sample Output 1

// Not Weird
import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //input
        int n=sc.nextInt();
        sc.close();
        
        if(n%2==0){
            if(n>=2 && n<=5){
                System.out.println("Not Weird");
            }else if(n>=6 && n<=20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}