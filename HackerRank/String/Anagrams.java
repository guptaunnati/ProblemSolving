package HackerRank.String;

import java.util.Scanner;

public class Anagrams {
    public static void print(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((int) arr[i] > (int) arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        a = b.toLowerCase();
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        int n = a.length();
        char[] charA = new char[n];
        char[] charB = new char[n];
        for (int i = 0; i < n; i++) {
            charA[i] = a.charAt(i);
            charB[i] = b.charAt(i);
        }
        print(charA);
        print(charB);

        sort(charA);
        sort(charB);

        print(charA);
        print(charB);

        for (int i = 0; i < n; i++) {
            if (charA[i] != charB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
