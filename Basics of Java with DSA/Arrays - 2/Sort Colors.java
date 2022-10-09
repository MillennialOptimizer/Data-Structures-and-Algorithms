
public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int n = arr.length;
        int s = 0, m = 0, e = n - 1; 
        while(m <= e){
            if(arr[m] == 0){
                int temp = arr[s];
                arr[s] = arr[m];
                arr[m] = temp;
                s++;
                m++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else if(arr[m] == 2){
                int temp = arr[e];
                arr[e] = arr[m];
                arr[m] = temp;
                e--;
            }
        }
    }

}
