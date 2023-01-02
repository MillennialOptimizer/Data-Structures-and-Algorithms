public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
		//JAI SHRI RAM 
		int n = arr.length; 
		int[] freq = new int[n-1]; 
		for(int i = 0; i < n; i++){
			freq[arr[i]]++;
		}
		for(int i = 0; i <= n-2; i++){
			if(freq[i] == 2)
				return i;
		}
		return -1;
	}
}
