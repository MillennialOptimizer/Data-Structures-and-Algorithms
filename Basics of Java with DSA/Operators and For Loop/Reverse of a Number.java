import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n; 
        int x = 0;
        while(num > 0){
            num = num/10;
            x++;
        }
        x--;
        int rnum = 0;
        int cntr = 0; 
        while(n > 0){
            rnum += (n%10)*Math.pow(10, x-cntr);
            cntr++;
            n = n/10;
        }
        System.out.print(rnum);
	}
}
