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
		short t= sc.nextShort();
		while(t>0){
		    short a=sc.nextShort();
		    short b=sc.nextShort();
		    short c=sc.nextShort();
		    short diff = (short)(b-a);
		    System.out.println(diff/c);
		    t--;
		}
	}
}
