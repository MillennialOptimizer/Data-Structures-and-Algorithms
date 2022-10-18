
public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int r = 0, c = 0; 
        int m = matrix.length;
        int n = 0;
        if(m > 0)
            n = matrix[0].length;
        while(r < m && c < n){
            for(int i = c; i < n; i++){
                System.out.print(matrix[r][i] + " ");
            }
            r++;
            for(int i = r; i < m; i++){
                System.out.print(matrix[i][n-1] + " ");
            }
            n--;
            if(r < m){
                for(int i = n-1; i >= c; i--){
                    System.out.print(matrix[m-1][i] + " ");
                }
                m--;
            }
            if(c < n){
                for(int i = m-1; i >= r; i--){
                    System.out.print(matrix[i][c] + " ");
                }
                c++;
            }
        }
	}
}
