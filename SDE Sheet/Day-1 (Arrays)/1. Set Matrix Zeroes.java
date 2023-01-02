class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        //JAI SHRI RAM 
        int m = matrix.length; 
        int n = matrix[0].length; 
        int[] rowFlag = new int[m];
        int[] colFlag = new int[n]; 
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1){
                    rowFlag[i] = 1; 
                    colFlag[j] = 1; 
                }
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(rowFlag[i] == 1 || colFlag[j] == 1){
                    matrix[i][j] = 1; 
                }
            }
        }
    }
}
