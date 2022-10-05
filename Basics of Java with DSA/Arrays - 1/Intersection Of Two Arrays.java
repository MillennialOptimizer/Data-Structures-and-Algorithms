
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int n = arr1.length; 
        int m = arr2.length;
        int[] flag = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr1[i] == arr2[j] && flag[j] == 0){
                    System.out.print(arr1[i] + " ");
                    flag[j] = 1;
                    break;
                }
            }
        }
    }
}
