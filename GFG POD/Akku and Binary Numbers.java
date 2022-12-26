class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long l, long r){
        int cntr = 0;
        for(int i = 0; i < 64; i++){
            for(int j = i+1; j < 64; j++){
                for(int k = j+1; k < 64; k++){
                    long n = ((long) 1 << i) | ((long) 1 << j) | ((long) 1 << k); 
                    if(n >= l && n <= r){
                        cntr++;
                    }
                }
            }
        }
        return cntr;
    }
    
}
