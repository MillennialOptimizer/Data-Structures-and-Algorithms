public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		// JAI SHRI RAM 
		int n = arr.length; 
		int[] contSum = new int[n+1];
		int sum = 0;
		for(int i = 0; i < n; i++)
			sum += arr[i];
		for(int i = 1; i <= n; i++){
			contSum[i] = contSum[i-1] + arr[i-1];
			int x = (sum - arr[i-1]);
			if(x % 2 == 0){
				if(x/2 == contSum[i-1]){
					return i-1;
				}
			}
		} 
		return -1;
	}
}
