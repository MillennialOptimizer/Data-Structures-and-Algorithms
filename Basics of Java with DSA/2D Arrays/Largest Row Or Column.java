
public class Solution {
	public static int rowSum(int a[][], int m, int n, int ind){
        int sum = 0; 
        for(int i = 0; i < n; i++){
            sum += a[ind][i];
        }
        return sum;
    }
    public static int colSum(int a[][], int m, int n, int ind){
        int sum = 0; 
        for(int i = 0; i < m; i++){
            sum += a[i][ind];
        }
        return sum;
    }
	public static void findLargest(int mat[][]){
		//Your code goes here
        int maxSum = Integer.MIN_VALUE; 
        int maxRow = -1, maxCol = -1; 
        int m = mat.length; 
        if(m == 0){
            System.out.println("row 0 " + Integer.MIN_VALUE);
            return;
        }
        int n = mat[0].length;
        for(int i = 0; i < m; i++){
            int sum = rowSum(mat, m, n, i);
            if(sum > maxSum){
                maxSum = sum; 
                maxRow = i;
                maxCol = -1;
            }
        }
        for(int i = 0; i < n; i++){
            int sum = colSum(mat, m, n, i);
            if(sum > maxSum){
                maxSum = sum;
                maxCol = i;
                maxRow = -1;
            }
        }
        
        if(maxRow == -1 && maxCol == -1){
            System.out.println("row 0 " + Integer.MIN_VALUE);
        }
        if(maxRow == -1){
            System.out.println("column " + maxCol + " " + colSum(mat, m, n, maxCol)); 
        }
        else{
            System.out.println("row " + maxRow + " " + rowSum(mat, m, n, maxRow));
        }
	}

}
