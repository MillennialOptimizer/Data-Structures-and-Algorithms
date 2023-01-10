class Solution {
    public int findDuplicate(int[] nums) {
        //JAI SHRI RAM 
        int n = nums.length;
        int[] freq = new int[n]; 
        for(int i = 0; i < n; i++){
            freq[nums[i]]++;
            if(freq[nums[i]] > 1)
                return nums[i];
        }
        return -1;
    }
}
