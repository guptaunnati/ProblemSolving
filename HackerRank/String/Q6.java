package HackerRank.String;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // scan.close();
        int count = 0;
        int j=0;
        for(int i=0; i<s.length()-1; i++){
            int n=i;
            System.out.println(n);
            while((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 &&s.charAt(i)<=122)){
                i++;
            }
            if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 &&s.charAt(i)<=122)){
                System.out.println(s.substring(n, i));
            }
            
            
        }
    }
}