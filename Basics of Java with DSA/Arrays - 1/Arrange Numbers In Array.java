
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int start = 0, end = n-1;
        for(int i = 0; i < n; i++){
            int num = i + 1; 
            if(num%2 != 0){
                arr[start] = num;
                start++;
            }
            else{
                arr[end] = num;
                end--;
            }
        }
    }
}
