import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = 1; j <= i; j++){
                sum += j; 
                if(j == i){
                    System.out.print(j + "=");
                    continue;
                }
                System.out.print(j + "+");
            }
            System.out.println(sum);
        }
	}
}
