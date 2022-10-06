
public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minInd = i; 
            for(int j = i+1; j < n; j++){
                if(arr[minInd] > arr[j] && i != j){
                    minInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }   

}
