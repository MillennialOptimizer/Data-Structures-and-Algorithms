/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Siddharth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int area1 = s.nextInt();
		int area2 = s.nextInt();
		int area3 = s.nextInt();
		int b = (int)(Math.sqrt((area2*area1)/(area3)));
		int a = area1/b;
		int c = area3 /a;
		int per = 4*(a + b + c);
		System.out.println(per);
	}
}
