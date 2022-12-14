public class Solution {

	public static int partition(int[] input, int l, int r){
		int pivot = input[r];
		int i = l - 1; 
		for(int j = l; j <= r-1; j++){
			if(input[j] < pivot){
				i++;
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}
		int temp = input[i+1];
		input[i+1] = input[r];
		input[r] = temp;
		return i+1;
	}
	
	public static void quickSortHelper(int[] input, int l, int r){
		if(l > r)
			return;
		int pi = partition(input, l, r);
		quickSortHelper(input, l, pi-1);
		quickSortHelper(input, pi+1, r);
	}

	public static void quickSort(int[] input) {
		int n = input.length;
		quickSortHelper(input, 0, n-1);
	}
	
}
