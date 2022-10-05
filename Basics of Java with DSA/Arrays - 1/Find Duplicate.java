
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int n = arr.length; 
        int dup = -1; 
        for(int i = 0; i < n; i++){
            dup = -1;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j] && i != j){
                    dup = arr[i];
                    break;
                }
            }
            if(dup != -1){
                break;
            }
        }
        return dup;
    }
}
