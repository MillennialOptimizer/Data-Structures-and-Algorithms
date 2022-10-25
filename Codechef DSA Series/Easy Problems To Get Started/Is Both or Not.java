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
		//JAI SHRI RAM 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt();
		if(n%5 == 0 && n%11 == 0){
		    System.out.println("BOTH");
		}
		else if(n%5 == 0 || n%11 == 0){
		    System.out.println("ONE");
		}
		else{
		    System.out.println("NONE");
		}
	}
}
