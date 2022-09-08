import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long cntr = 0; 
        long sum = 0; 
        long prod = 1;
        while(n > 0){
            int rem = n%2; 
            sum = sum + rem*prod;
            prod = prod*10;
            n = n/2;
        }
        System.out.println(sum);
	}
}
