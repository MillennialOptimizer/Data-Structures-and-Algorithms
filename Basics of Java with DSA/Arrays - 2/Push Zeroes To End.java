public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int l = 0, r = 0; 
        int n = arr.length; 
        while(l != n){
            while(r != n && arr[r] != 0)
                r++;
            if(r == n)
                break;
            if(l > r && arr[l] != 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
            l++;
        }
    }

}
