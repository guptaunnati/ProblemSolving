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
		int t=sc.nextInt();
		for(int i=0; i<t; i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x<y){
		        System.out.println("FIRST");
		    }else if(x>y ){
		        System.out.println("SECOND");
		    }else{
		        System.out.println("ANY");
		    }
		}
	}
}
