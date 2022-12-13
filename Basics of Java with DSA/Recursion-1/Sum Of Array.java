public class Solution {
	public static int sumTillIndex(int[] arr, int i){
		if(i == 0){
			return arr[0];
		}
		int sumTillPrevEle = sumTillIndex(arr, i-1);
		return sumTillPrevEle + arr[i];
	}
	public static int sum(int input[]) {
		int n = input.length;
		return sumTillIndex(input, n-1); 
	}
}
