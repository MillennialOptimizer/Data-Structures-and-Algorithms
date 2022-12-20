
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(m == 0 || n == 0)
			return 0;
		if(n == 1)
			return m; 
		return multiplyTwoIntegers(m, n-1) + m;
	}
}
