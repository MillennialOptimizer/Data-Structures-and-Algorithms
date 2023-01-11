class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        int[] temp = new int[m+n];  
        int i = 0, j = 0; 
        while(i < m && j < n){
            if(nums1[i] > nums2[j])
                temp[k++] = nums2[j++];
            else
                temp[k++] = nums1[i++];
        }
        while(i < m)
            temp[k++] = nums1[i++];
        while(j < n)
            temp[k++] = nums2[j++];
        for(int ind = 0; ind < m+n; ind++)
        {
            nums1[ind] = temp[ind];
        }
    }
}
