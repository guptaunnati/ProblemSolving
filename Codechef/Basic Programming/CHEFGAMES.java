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
            byte r1=sc.nextByte();
            byte r2=sc.nextByte();
            byte r3=sc.nextByte();
            byte r4=sc.nextByte();
            
            if(r1==0 && r2==0 && r3==0 && r4==0){
                System.out.println("IN");
            }else{
                System.out.println("OUT");
            }
            t--;
		}
	}
}
