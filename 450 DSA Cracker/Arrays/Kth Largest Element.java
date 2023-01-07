// #1
class Solution {

    public static int partition(int[] nums, int l, int r){
        int index= l-1, pivot = nums[r]; 
        for(int i = l; i <= r-1; i++){
            if(nums[i] <= pivot){
                index++;
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[index+1];
        nums[index+1] = nums[r];
        nums[r] = temp;

        return index+1;
    }

    public static int findKthSmallest(int[] nums, int l, int r, int k){
        if(k > 0 && k <= r-l+1){
            int pos = partition(nums, l, r); 
            if(pos-l == k-1){
                return nums[pos];
            }
            else if(pos-l > k-1){
                return findKthSmallest(nums, l, pos-1, k);
            }
            else{
                return findKthSmallest(nums, pos+1, r, k-(pos-l+1));
            }
        }
        return -1;
    }

    public int findKthLargest(int[] nums, int k) {
        //JAI SHRI RAM 
        // kth largest will be (n-k+1) smallest number
        int n = nums.length; 
        return findKthSmallest(nums, 0, n-1, n-k+1);
    }
}

// #2
class Solution {

    public static int partitionDesc(int[] nums, int l, int r){
        int index= l-1, pivot = nums[r]; 
        for(int i = l; i <= r-1; i++){
            if(nums[i] >= pivot){
                index++;
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[index+1];
        nums[index+1] = nums[r];
        nums[r] = temp;

        return index+1;
    }

    public static int findKthLargestHelper(int[] nums, int l, int r, int k){
        if(k > 0 && k <= r-l+1){
            int pos = partitionDesc(nums, l, r); 
            if(pos-l == k-1){
                return nums[pos];
            }
            else if(pos-l > k-1){
                return findKthLargestHelper(nums, l, pos-1, k);
            }
            else{
                return findKthLargestHelper(nums, pos+1, r, k-(pos-l+1));
            }
        }
        return -1;
    }

    public int findKthLargest(int[] nums, int k) {
        //JAI SHRI RAM 
        // during quick sort we just sort it in descending order -> then its ditto to finding kth smallest element in array
        int n = nums.length; 
        return findKthLargestHelper(nums, 0, n-1, k);
    }
}
