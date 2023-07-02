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
            short x=sc.nextShort();
            int slice=n*x;
            if(slice%4==0){
                System.out.println(slice/4);
            }else{
                System.out.println(slice/4 +1);
            }
            t--;
		}
	}
}
