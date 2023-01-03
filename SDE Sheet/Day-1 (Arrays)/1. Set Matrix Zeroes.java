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

// Most Optimized 
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

        // using flags to track the first row and first col 
        boolean rowFlag = false, colFlag = false; 

        // for the first row
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == 1)
                rowFlag = true;
        }

        // for the first col 
        for(int j = 0; j < m; j++){
            if(matrix[j][0] == 1)
                colFlag = true;
        }

        // for the rest of the matrix 
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 1){
                    matrix[i][0] = 1; 
                    matrix[0][j] = 1;
                }
            }
        }

        // we reflect the changes 
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[0][j] == 1 || matrix[i][0] == 1){
                    matrix[i][j] = 1;
                }
            }
        }

        // now for the first row and first col 

        if(rowFlag){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 1;
            }
        }

        if(colFlag){
            for(int j = 0; j < m; j++){
                matrix[j][0] = 1;
            }
        }
    }
}
