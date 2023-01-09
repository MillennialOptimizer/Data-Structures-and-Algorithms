class Solution {

    // reversing a particular subarray from l to r (both inclusive)
    public static void reverse(int[] nums, int l, int r){
        while(r >= l){
            int temp = nums[r]; 
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {
        //JAI SHRI RAM 
        int n = nums.length; 
        reverse(nums, 0, n-1); 
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
}
