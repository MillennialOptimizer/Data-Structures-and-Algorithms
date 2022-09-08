import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0; 
        int cntr = 0;
        while(n > 0){
            sum += (n%10)*Math.pow(2, cntr);
            cntr++;
            n = n/10;
        }
        System.out.println(sum);
	}
}
