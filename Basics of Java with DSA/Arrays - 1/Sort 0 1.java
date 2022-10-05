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
