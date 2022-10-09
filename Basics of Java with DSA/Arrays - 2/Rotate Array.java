
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n = arr.length;
        int[] rArr = new int[n];
        for(int i = 0; i < n; i++){
            if(i < d){
                rArr[n-d+i] = arr[i];
            }
            else{
                rArr[i-d] = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = rArr[i];
        }
    }

}
