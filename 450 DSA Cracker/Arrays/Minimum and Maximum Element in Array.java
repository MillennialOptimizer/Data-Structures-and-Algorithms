
class Compute 
{
    //JAI SHRI RAM 
    public static long getMin(long a[], long n){
        long minEle = Long.MAX_VALUE; 
        for(int i = 0; i < n; i++){
            if(minEle > a[i]){
                minEle = a[i];
            }
        }
        return minEle; 
    }
    
    public static long getMax(long a[], long n){
        long maxEle = Long.MIN_VALUE; 
        for(int i = 0; i < n; i++){
            if(maxEle < a[i]){
                maxEle = a[i];
            }
        }
        return maxEle;
    }
    
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long maxEle = getMax(a, n); 
        long minEle = getMin(a, n); 
        pair res = new pair(minEle, maxEle);
        return res;
    }
}
