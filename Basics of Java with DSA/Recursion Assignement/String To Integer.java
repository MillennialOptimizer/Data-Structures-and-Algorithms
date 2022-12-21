import java.lang.*;
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
		int n = input.length(); 
		if(n == 1){
			return input.charAt(0) - '0';
		}
		int rem = convertStringToInt(input.substring(1));
		int curDig = input.charAt(0) - '0';
		return curDig*(int)Math.pow(10, n-1) + rem;
	}
}
