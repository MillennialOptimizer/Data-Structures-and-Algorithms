/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int maximumofThree(int a, int b, int c){
        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else
            return c;
    }
    public static int maximumofTwo(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//JAI SHRI RAM 
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int globalMax = maximumofThree(a, b, c);
		if(a == globalMax){
		    System.out.println(maximumofTwo(b, c));
		}
		else if(b == globalMax){
		    System.out.println(maximumofTwo(a, c));
		}
		else{
		    System.out.println(maximumofTwo(a, b));
		}
	}
}
