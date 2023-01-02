public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
		//JAI SHRI RAM 
		int n = arr.length; 
		int[] freq = new int[1000000]; 
		for(int i = 0; i < n; i++){
			freq[arr[i]]++;
		}
		for(int i = 0; i < freq.length; i++){
			if(freq[i] == 1)
				return i;
		}
		return -1;
	}
}
