import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
	}

}
