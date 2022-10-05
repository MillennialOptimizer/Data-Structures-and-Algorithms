class Solution
{
    //OM GAN GANAPATHAYE NAMO NAMAH 
    //JAI SHRI RAM 
    //JAI BAJRANGBALI 
    //AMME NARAYANA, DEVI NARAYANA, LAKSHMI NARAYANA, BHADRE NARAYANA
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i < n-1; i++){
	        int minEle = arr[i];
	        int minInd = i;
	        for(int j = i+1; j < n; j++){
	            if(arr[j] < minEle){
	                minEle = arr[j];
	                minInd = j;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[minInd];
	        arr[minInd] = temp;
	    }
	}
}
