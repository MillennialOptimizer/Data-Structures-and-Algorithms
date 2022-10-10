// Linear Search 
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int ind = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                ind = i;
                break;
            }
        }
        return ind;
    }
}

// Binary Search 

public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int ind = -1; 
        int l = 0, r = arr.length - 1; 
        while(r >= l){
            int mid = (r + l)/2; 
            if(arr[mid] == x){
                ind = mid;
                break;
            }
            else if(arr[mid] > x){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ind;
    }

}
