import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Siddharth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n <= 1){
		    System.out.println("-1");
		    return;
		}
		if(n%2 != 0){
		    System.out.println("-1");
		    return;
		}
		for(int i = n; i > 0; i--){
		    System.out.print(i + " ");
		}
		System.out.println("");
	}
}
