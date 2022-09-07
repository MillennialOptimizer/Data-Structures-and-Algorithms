import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int sum = 0, product = 1; 
        for(int i = 1; i <= n; i++){
            sum += i;
            product *= i;
        }
        if(c == 1){
            System.out.println(sum);
        }
        else if(c == 2){
            System.out.println(product);
        }
        else{
            System.out.println("-1");
        }
	}
}
