
public class solution {

	public static boolean isPalHelper(String s, int l, int r){
		if(l > r){
			return true;
		}
		boolean isRemPal = isPalHelper(s, l+1, r-1);
		if(s.charAt(l) != s.charAt(r))
			return false; 
		else if(!isRemPal)
			return false;
		else
			return true;
	}

	public static boolean isStringPalindrome(String input) {
		// Write your code here
		int n = input.length(); 
		return isPalHelper(input, 0, n-1);
	}
}
