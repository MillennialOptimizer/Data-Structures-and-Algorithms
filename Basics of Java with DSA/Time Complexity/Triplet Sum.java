import java.util.*;
public class Solution {	
	// JAI SHRI RAM 
	public static int firstIndex(int[] arr, int l, int x){
		int n = arr.length; 
		int r = n-1; 
		int res = -1; 
		while(r >= l){
			int mid = (l + r)/2; 
			if(arr[mid] == x){
				res = mid; 
				r = mid-1; 
			}
			else if(arr[mid] > x){
				r = mid - 1;
			}
			else{
				l = mid + 1; 
			}
		}
		return res;
	}

	public static int lastIndex(int[] arr, int l, int x){
		int n = arr.length; 
		int r = n-1; 
		int res = -1; 
		while(r >= l){
			int mid = (l + r)/2; 
			if(arr[mid] == x){
				res = mid; 
				l = mid + 1; 
			}
			else if(arr[mid] > x){
				r = mid - 1;
			}
			else{
				l = mid + 1; 
			}
		}
		return res;
	}

	public static int pairSum(int[] arr, int l, int num) {
		//Your code goes here
		int n = arr.length; 
		boolean[] visited = new boolean[n];
		int cntr = 0;
		for(int i = l; i < n; i++){
			int x = num - arr[i]; 
			int first = firstIndex(arr, i+1, x);
			int last = lastIndex(arr, i+1, x);
			if(first != -1 && last != -1){
				cntr += (last - first + 1);
			}
		}

		return cntr;
	}
	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
		Arrays.sort(arr);
		int n = arr.length; 
		int cntr = 0; 
		for(int i = 0; i < n; i++){
			int x = num - arr[i]; 
			cntr += pairSum(arr, i+1, x);
		}
		return cntr;
	}
}
