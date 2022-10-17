// also solution for row sum problem
class Solution {
    int rowSum(int a[][], int n, int m, int ind){
        int sum = 0;
        for(int i = 0; i < m; i++){
            sum += a[ind][i];
        }
        return sum;
    }
    int colSum(int a[][], int n, int m, int ind){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i][ind];
        }
        return sum;
    }
    int sumOfRowCol(int n, int m, int a[][]) {
        // code here
        int minInd = m;
        if(n < m){
            minInd = n; 
        }
        for(int i = 0; i < minInd; i++){
            int rSum = rowSum(a, n, m, i);
            int cSum = colSum(a, n, m, i);
            if(rSum != cSum)
                return 0;
        }
        return 1;
        
    }
}
