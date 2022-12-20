
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
		if(input < 10)
			return input; 
		return sumOfDigits(input/10) + input%10;
	}
}
