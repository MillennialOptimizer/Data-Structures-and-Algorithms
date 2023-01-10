class Solution {
    
    public static int min(int a, int b){
        if(a > b)
            return b; 
        return a; 
    }
    
    public static int max(int a, int b){
        if(a > b)
            return a; 
        return b;
    }
    
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        // JAI SHRI RAM 
        Arrays.sort(arr); 
        int maxHeight = arr[n-1], minHeight = arr[0]; 
        int minDiff = maxHeight - minHeight; 
        
        for(int i = 1; i < n; i++){
            if(arr[i] - k < 0)
                continue; 
            minHeight = min(arr[0] + k, arr[i] - k); 
            maxHeight = max(arr[n-1] - k, arr[i-1] + k);
            minDiff = min(minDiff, maxHeight-minHeight);
        }
        return minDiff;
    }
}
