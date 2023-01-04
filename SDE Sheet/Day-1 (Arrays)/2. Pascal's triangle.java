class Solution {
    static Long mod = new Long(1000000007);
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        //JAI SHRI RAM 
        Long[][] matrix = new Long[n][n]; 
        for(int i = 0; i < n; i++){
            Long[] row = new Long[i+1]; 
            matrix[i][0] = new Long(1); 
            matrix[i][i] = new Long(1); 
            for(int j = 1; j < i; j++){
                matrix[i][j] = (matrix[i-1][j-1]%mod + matrix[i-1][j]%mod)%mod; 
            }
        }
        
        ArrayList<Long> arr = new ArrayList<Long>();
        
        for(int i = 0; i < n; i++){
            arr.add(new Long(matrix[n-1][i]));
        }
        
        return arr;
    }
}
