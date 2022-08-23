import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int oddSum = 0, evenSum = 0; 
        long n = s.nextLong();
        while(n > 0){
            long digit = n%10; 
            if(digit%2 == 0){
                evenSum += digit;
            }
            else{
                oddSum += digit;
            }
            n = n/10;
        }
        System.out.println(evenSum + " " + oddSum);
	}
}
