
public class Solution {  

    public static void insertionSort(int[] arr) {
    	//Your code goes here
        int n = arr.length; 
        for(int i = 1; i < n; i++){
            int val = arr[i]; 
            int j = i - 1; 
            while(j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
    }

}
