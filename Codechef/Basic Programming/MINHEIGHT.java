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
            short x=sc.nextShort();
            short y=sc.nextShort();
            if(x>=y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
		}
	}
}
