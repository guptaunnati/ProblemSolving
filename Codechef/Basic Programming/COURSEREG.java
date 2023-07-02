/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner (System.in);
		short t=sc.nextShort();
        while(t>0){
            short n=sc.nextShort();
            short m=sc.nextShort();
            short k=sc.nextShort();
            short availableSeats=(short)(m-k);
            if(availableSeats<n){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            t--;
		}
	}
}
