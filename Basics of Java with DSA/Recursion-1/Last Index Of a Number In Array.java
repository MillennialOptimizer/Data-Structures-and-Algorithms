
public class Solution {
	public static int checkTillIndex(int arr[], int x, int i){
		if(i < 0){
			return -1; 
		}
		int checkTillPrevEle = checkTillIndex(arr, x, i-1);
		if(arr[i] == x){
			return i;
		}
		return checkTillPrevEle;
	}
	public static int lastIndex(int input[], int x) {
		int n = input.length; 
		return checkTillIndex(input, x, n-1);
	}
	
}
