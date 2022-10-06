
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n = arr1.length; 
        int m = arr2.length; 
        int i = 0, j = 0; 
        int[] res = new int[m+n];
        int ind = 0;
        while(i < n && j < m){
            if(arr1[i] == arr2[j]){
                res[ind++] = arr1[i++];
                res[ind++] = arr2[j++];
            }
            else if(arr1[i] > arr2[j]){
                res[ind++] = arr2[j++];
            }
            else{
                res[ind++] = arr1[i++];
            }
        }
        while(i < n){
            res[ind++] = arr1[i++];
        }
        while(j < m){
            res[ind++] = arr2[j++];
        }
        return res;
    }

}
