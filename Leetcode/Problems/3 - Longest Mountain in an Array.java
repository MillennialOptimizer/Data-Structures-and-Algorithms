class Solution {
    public int longestMountain(int[] nums) {
        int n = nums.length; 
        int maxMountLen = 0; 
        int i = 0;
        while(i < n)
        {
            int start = i; 
            while(i < n-1 && nums[i] < nums[i+1])
                i++;
            if(start == i){
                i++;
                continue;
            }
            int peak = i; 
            while(i < n-1 && nums[i] > nums[i+1]){
                i++;
            }
            if(peak == i){
                i++;
                continue;
            }
            if(maxMountLen < i - start + 1)
                maxMountLen = i - start + 1;
        }
        return maxMountLen;
    }
}
