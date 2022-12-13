public class Solution {
	public static boolean checkNumberTillIndex(int[] arr, int x, int i){
		if(i < 0)
			return false;
		boolean checkForPrevEle = checkNumberTillIndex(arr, x, i-1);
		if(checkForPrevEle || arr[i] == x){
			return true;
		}
		return false;
	}
	public static boolean checkNumber(int input[], int x) {
		int n = input.length; 
		return checkNumberTillIndex(input, x, n-1);
	}
}
