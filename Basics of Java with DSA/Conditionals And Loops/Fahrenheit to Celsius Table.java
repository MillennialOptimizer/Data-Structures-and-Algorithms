import java.util.Scanner;
public class Solution {

	public static int FToCConverter(int tempInF){
        int tempInC = (tempInF - 32)*5/9;
        return tempInC;
    }
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        int i = S;
        while(i <= E){
            int tempInC = FToCConverter(i);
            System.out.println(i + " " + tempInC);
            i = i + W;
        }
	}

}
