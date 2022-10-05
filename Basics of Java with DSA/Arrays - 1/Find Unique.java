public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        int unique = -1, n = arr.length; 
        for(int i = 0; i < n; i++){
            unique = arr[i];
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j] && i != j){
                    unique = -1;
                    break;
                }
            }
            if(unique == arr[i]){
                break;
            }
        }
        return unique;
    }
}
