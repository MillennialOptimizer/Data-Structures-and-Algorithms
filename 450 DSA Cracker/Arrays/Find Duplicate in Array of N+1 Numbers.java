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


// most optimized 
class Solution {
    public int findDuplicate(int[] nums) {
        // JAI SHRI RAM 
        int n = nums.length; 
        int slow = nums[0], fast = nums[0]; 
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast); // we do a do while loop as it should break when slow equals fast 

        fast = nums[0]; 
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
