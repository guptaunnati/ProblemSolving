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
            short a=sc.nextShort();
            short b=sc.nextShort();
            short c=sc.nextShort();
            if((a+b)/2<35 || (b+c)/2<35 || (a+c)/2<35){
                System.out.println("FAIL");
            }else{
                System.out.println("PASS");
            }
            t--;
		}
	}
}
