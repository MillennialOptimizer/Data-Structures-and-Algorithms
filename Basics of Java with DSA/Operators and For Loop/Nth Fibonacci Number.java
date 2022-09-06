import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] fib = new int[100000];
        fib[0] = 0; 
        fib[1] = 1; 
        fib[2] = 1; 
        for(int i = 3; i <= n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.print(fib[n]);
		
	}

}
