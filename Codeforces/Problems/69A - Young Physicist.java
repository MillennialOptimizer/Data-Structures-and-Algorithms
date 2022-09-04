import java.io.*;
import java.util.*;
 
public class Siddharth {
	public static void main(String[] args) {
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100]; 
		for(int i = 0; i < n; i++){
		    x[i] = s.nextInt();
		    y[i] = s.nextInt();
		    z[i] = s.nextInt();
		}
		int sumX = 0, sumY = 0, sumZ = 0; 
		for(int i = 0; i < n; i++){
		    sumX += x[i];
		    sumY += y[i];
		    sumZ += z[i];
		}
		if(sumX == 0 && sumY == 0 && sumZ == 0){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
