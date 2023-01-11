class Solution {
    public static boolean search(int[] arr, int x, int l, int r){
        while(r >= l){
            int mid = (r + l)/2; 
            if(arr[mid] == x)
                return true; 
            else if(arr[mid] > x)
                r = mid - 1; 
            else
                l = mid + 1;
        }
        return false;
    }
    public long minIncrements(int[] arr, int n) {
        // Code here
        // JAI SHRI RAM  
        long sum = 0; 
        Arrays.sort(arr);
        int[] brr = new int[n];
        int k = 0; 
        for(int i = 0; i < n; i++){
            int num = arr[i]; 
            while(search(brr, num, 0, k-1))
                num++;
            brr[k++] = num;
            while(i < n-1 && arr[i] == arr[i+1]){
                num++;
                brr[k++] = num; 
                i++;
            }
        }
        for(int i = 0; i < n; i++){
            sum += (long)(brr[i] - arr[i]);
        }
        return sum;
    }
}
