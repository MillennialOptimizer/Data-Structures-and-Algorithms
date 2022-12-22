class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //JAI SHRI RAM 
        //jai bajrangbali 
        long[] contSum = new long[n+1]; 
        contSum[0] = 0; 
        for(int i = 1; i < n+1; i++){
            contSum[i] = contSum[i-1] + arr[i-1];
        }
        Arrays.sort(contSum);
        long numOfSubArrays = 0; 
        for(int i = 0; i < n+1; i++){
            int freq = 1; 
            while(i < n && contSum[i] == contSum[i+1]){
                freq++;
                i++;
            }
            if(freq >= 2){
                numOfSubArrays += (freq*(freq-1))/2;
            }
        }
        return numOfSubArrays;
    }
}
