class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        //JAI SHRI RAM 
        int posEle = 0, negEle = 0; 
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                negEle++;
            }
            else{
                posEle++;
            }
        }
        int[] pos = new int[posEle]; 
        int[] neg = new int[negEle];
        int j = 0, k = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                neg[j++] = arr[i];
            }
            else{
                pos[k++] = arr[i];
            }
        }
        
        j = 0;
        for(int i = 0; i < posEle; i++){
            arr[j++] = pos[i];
        }
        for(int i = 0; i < negEle; i++){
            arr[j++] = neg[i];
        }
    }
}
