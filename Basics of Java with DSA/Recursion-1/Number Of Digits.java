public class Solution {

	public static int count(int n){
		//Write your code here
		if(n < 10)
			return 1; 
		return 1 + count(n/10);
	}
}
