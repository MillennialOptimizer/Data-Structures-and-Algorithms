public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        int ans = 0; 
        int n = arr.length;
        for(int i = 1; i < n; i++){
            if(i == n-1){
                if(arr[i] < arr[i-1]){
                    ans = i;
                    break;
                }
            }
            if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
                ans = i;
                break;
            }
        }
        return ans;
    }

}
