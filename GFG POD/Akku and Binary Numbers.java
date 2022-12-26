// Naive soln 
class Solution{
    
    //JAI SHRI RAM 
    void precompute(){
    
    }
    public static long countSetBits(long x){
        int cntr = 0;
        while(x != 0){
            if(x%2 != 0)
                cntr++;
            x = x >> 1; 
        }
        return cntr;
    }
    long solve(long l, long r){
        int cntr = 0;
        // Code here
        for(long i = l; i <= r; i++){
            if(countSetBits(i) == 3)
                cntr++;
        }
        return cntr;
    }
    
}


// Optimized
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
