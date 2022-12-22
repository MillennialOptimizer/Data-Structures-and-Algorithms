
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {

        int n = arr1.length, m = arr2.length; 
        boolean isCovered[] = new boolean[m]; // checks if the element in arr2 is already in an intersection or not 
        for(int i = 0; i < n; i++){
            boolean isExisting = false;
            for(int j = 0; j < m; j++){
                if(arr2[j] == arr1[i] && isCovered[j] == false){
                    isExisting = true;
                    isCovered[j] = true;
                    break;
                }
            }
            if(isExisting){
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
