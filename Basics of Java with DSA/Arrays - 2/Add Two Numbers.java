
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int n = arr1.length, m = arr2.length;
        int[] rArr1 = new int[n];
        int[] rArr2 = new int[m];
        for(int i = 0; i < n; i++){
            rArr1[i] = arr1[n-1-i];
        }
        for(int i = 0; i < m; i++){
            rArr2[i] = arr2[m-1-i];
        }
        int[] res = new int[10000];
        int i = 0, j = 0, carry = 0, k = 0; 
        while(i < n && j < m){
            int sum = rArr1[i] + rArr2[j] + carry; 
            res[k] = sum%10;
            carry = sum/10;
            i++;
            j++;
            k++;
        }
        while(i < n){
            int sum = rArr1[i] + carry; 
            res[k] = sum%10;
            carry = sum/10;
            i++;
            k++;
        }
        while(j < m){
            int sum = rArr2[j] + carry; 
            res[k] = sum%10;
            carry = sum/10;
            j++;
            k++;
        }
        res[k] = carry;
        k++;
        for(i = 0; i < k; i++){
            output[i] = res[k-1-i];
        }
    }

}
