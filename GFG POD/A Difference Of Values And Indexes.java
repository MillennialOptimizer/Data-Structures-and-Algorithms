class Solution{
    
   
    // Function for finding maximum and value pair
    public static int maxDistance (int arr[], int n) {
        //Complete the function
        int[] temp1 = new int[n];
        int[] temp2 = new int[n]; 
        for(int i = 0; i < n; i++){
            temp1[i] = arr[i] - i; 
            temp2[i] = arr[i] + i; 
        }
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE; 
        for(int i = 0; i < n; i++){
            if(min1 > temp1[i])
                min1 = temp1[i]; 
            if(min2 > temp2[i])
                min2 = temp2[i]; 
            if(max1 < temp1[i])
                max1 = temp1[i]; 
            if(max2 < temp2[i])
                max2 = temp2[i];
        }
        int res1 = max1 - min1; 
        int res2 = max2 - min2; 
        if(res1 > res2)
            return res1;
        else
            return res2;
    }
    
    
}
