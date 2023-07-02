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
            short steps=(short)(x/y);
            if(y*steps==x){
                System.out.println(steps);
            }else{
                System.out.println(steps+(x-steps*y));
            }
            t--;
		}
	}
}
