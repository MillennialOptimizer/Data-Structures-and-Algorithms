import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dig = 0; 
        int num = n; 
        while(num != 0){
            dig++;
            num = num/10;
        }
        num = n; 
        int sum = 0;
        while(num != 0){
            int prod = 1; 
            int x = num%10;
            for(int i = 0; i < dig; i++)
            {
                prod = prod*x;
            }
            sum += prod;
            num = num/10;
        }
        if(sum == n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
	}
}
