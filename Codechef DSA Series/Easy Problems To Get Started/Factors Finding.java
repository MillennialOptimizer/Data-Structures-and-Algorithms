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
		int cntr = 0;
		int[] arr = new int[n];
		for(int i = 1; i <= n; i++){
		    if(n%i == 0)
		    {
		        arr[cntr++] = i;
		    }
		}
		System.out.println(cntr);
		for(int i = 0; i < cntr; i++){
		    System.out.print(arr[i] + " ");
		}
	}
}
