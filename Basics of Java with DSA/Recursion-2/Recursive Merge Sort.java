public class solution {

	public static void mergeSortedArrays(int[] input, int l, int mid, int r){
		int n1 = mid - l + 1;
		int n2 = r - mid; 
		int n = r - l + 1;
		int firstHalf[] = new int[n1];
		int secondHalf[] = new int[n2];
		int temp[]  = new int[n];
		for(int i = 0; i < n1; i++){
			firstHalf[i] = input[l + i];
		}
		for(int i = 0; i < n2; i++){
			secondHalf[i] = input[mid+1+i];
		}
		// merge the two sorted arrays 
		int p1 = 0, p2 = 0, p = 0; 
		while(p1 < n1 && p2 < n2){
			if(firstHalf[p1] > secondHalf[p2]){
				temp[p++] = secondHalf[p2++];
			}
			else{
				temp[p++] = firstHalf[p1++];
			}
		}
		while(p1 < n1){
			temp[p++] = firstHalf[p1++];
		}
		while(p2 < n2){
			temp[p++] = secondHalf[p2++];
		}
		for(int i = 0; i < n; i++){
			input[l + i] = temp[i];
		}
	}

	public static void mergeSortHelper(int[] input, int l, int r){
		if(r <= l)
			return;
		int mid = (r + l)/2; 
		mergeSortHelper(input, l, mid);
		mergeSortHelper(input, mid+1, r);
		mergeSortedArrays(input, l, mid, r);
	}

	public static void mergeSort(int[] input){
		// Write your code here
		int n = input.length;
		mergeSortHelper(input, 0, n-1);
	}
}
