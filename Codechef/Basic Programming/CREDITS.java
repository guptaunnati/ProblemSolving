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
            if(x>65){
                System.out.println("Overload");
            }else if(x<35){
                System.out.println("Underload");
            }else{
                System.out.println("Normal");
            }
            t--;
		}
	}
}
