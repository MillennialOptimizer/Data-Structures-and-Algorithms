import java.util.*;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		//JAI SHRI RAM 
		int n = arr1.length; 
		int m = arr2.length; 
		boolean[] visited = new boolean[m];
		Arrays.sort(arr1);
		Arrays.sort(arr2); 
		int i = 0, j = 0; 
		while(i < n && j < m){
			if(arr1[i] == arr2[j] ){
				if(visited[j] == false){
					visited[j] = true; 
					System.out.print(arr2[j] + " ");
				}
				i++;
				j++;
			}
			else if(arr1[i] > arr2[j])
				j++;
			else
				i++;
		}
	}

}
