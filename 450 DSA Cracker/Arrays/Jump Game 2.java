class Solution {
    public static int max(int a, int b){
        if(a > b)
            return a; 
        return b; 
    }
    
    public int jump(int[] nums) {
        // JAI SHRI RAM 
        int farthest = 0, jumps = 0, current = 0; 
        int n = nums.length; 
        for(int i = 0; i < n-1; i++){
            farthest = max(farthest, i + nums[i]); 
            if(i == current){
                jumps++; 
                current = farthest;
            }
        }
        return jumps;
    }
}
