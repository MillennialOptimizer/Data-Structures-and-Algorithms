public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int oneCount = 0, zeroCount = 0, ind = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1)
                oneCount++;
            else
                zeroCount++;
        }
        for(int i = 0; i < zeroCount; i++){
            arr[ind++] = 0;
        }
        for(int i = 0; i < oneCount; i++){
            arr[ind++] = 1;
        }
        
    }
}

// space optimized
public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int l = 0, r = 0; 
        int n = arr.length; 
        while(l < n){
            while(r < n && arr[r] == 0)
                r++;
            if(l > r && arr[l] == 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
            l++;
        }
    }
}
