class Solution{
    
    public static int partition(int[] arr, int l, int r){
        int pivot = arr[r]; // pivot is the last element 
        int index = l - 1; 
        
        //no need to consider the last element as its the pivot
        for(int i = l; i <= r-1; i++){
            
            // if the current element is lower than the pivot element 
            if(arr[i] <= pivot){
                
                index++;
                // swap the value of index with arr[i]
                int temp = arr[index];
                arr[index] = arr[i]; 
                arr[i] = temp;
            }
        }
        
        // index+1 will be the correct position of pivot 
        // swap index+1 with pivot element 
        int temp = arr[index+1];
        arr[index+1] = arr[r];
        arr[r] = temp;
        
        return index+1;
    }
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        //JAI SHRI RAM 
        
        // check if k has a correct range 
        if(k > 0 && k <= r-l+1){
            
            // find the position of the pivot element (last element) in the sorted array 
            int pos = partition(arr, l, r); 
            
            // check if pos-l => relative index from the start of array,  is going to be at (k-1)th index making it the k th  smallest 
            if(pos-l == k-1)
                return arr[pos];
            else if(pos-l > k-1)
                return kthSmallest(arr, l, pos-1, k);
            else
                return kthSmallest(arr, pos+1, r, k - (pos-l+1)); // we do (k-(pos-l+1)) as its the relative index
        }
        return -1;
    } 
}
