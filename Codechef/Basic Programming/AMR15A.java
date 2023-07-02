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
		short n= sc.nextShort();
		int ready=0;
		int notReady=0;
		while(n>0){
		    short a=sc.nextShort();
		    if(a%2==0){
		        ready++;
		    }else{
		        notReady++;
		    }
		    n--;
		}
		if(ready>notReady){
		    System.out.println("READY FOR BATTLE");
		}else{
		    System.out.println("NOT READY");
		}
	}
}
