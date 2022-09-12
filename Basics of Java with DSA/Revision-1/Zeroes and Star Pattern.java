import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            int part2 = n - i; 
            int part1 = n - part2 - 1; 
            for(int j = 0; j < part1; j++){
                System.out.print("0");
            }
            System.out.print("*");
            for(int j = 0; j < part2; j++){
                System.out.print("0");
            }
            System.out.print("*");
            for(int j = 0; j < part2; j++){
                System.out.print("0");
            }
            System.out.print("*");
            for(int j = 0; j < part1; j++){
                System.out.print("0");
            }
            System.out.println("");
        }
		
	}	


}
