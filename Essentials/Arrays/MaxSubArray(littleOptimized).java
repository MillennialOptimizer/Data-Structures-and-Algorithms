class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; 
        int n = nums.length; 
        int[] prefixSum = new int[n+1];
        prefixSum[0] = 0; 
        for(int i = 1; i <= n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                int tempSum = prefixSum[j] - prefixSum[i];
                if(tempSum > maxSum){
                    maxSum = tempSum;
                }
            }
        }
        return maxSum;
    }
}
