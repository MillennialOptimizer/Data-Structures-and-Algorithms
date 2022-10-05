
public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int n = arr.length;
        for(int i = 0; i < n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
