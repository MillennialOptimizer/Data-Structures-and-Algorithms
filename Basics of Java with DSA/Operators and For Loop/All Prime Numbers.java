import java.util.Scanner;
public class Solution {

    public static boolean IsPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 2; i <= n; i++){
            if(IsPrime(i)){
                System.out.println(i);
            }
        }
		
	}
}
