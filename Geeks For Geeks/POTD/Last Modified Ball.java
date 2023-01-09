class Solution {
    int solve(int n, int[] arr) {
        // code here
        //JAI SHRI RAM 
        int ind = -1;
        for(int i = n-1; i >= 0; i--){
            if(arr[i] == 9){
                continue;
            }
            else{
                ind = i;
                break;
            }
        }
        return ind+1; // as they follow 1 based indexing
    }
};
