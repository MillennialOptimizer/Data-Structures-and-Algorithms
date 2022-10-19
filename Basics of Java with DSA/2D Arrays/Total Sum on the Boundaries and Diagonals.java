
public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        int sum = 0; 
        int m = mat.length; 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || j == 0 || i == m-1 || j == m-1 || i == j || i+j == m-1)
                    sum += mat[i][j];
			}
        }
        System.out.println(sum);
	}

}
