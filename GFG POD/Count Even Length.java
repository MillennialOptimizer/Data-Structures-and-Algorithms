class Solution
{
    public static int countSeq(int n, int d){
        if(Math.abs(d) > n)
            return 0; 
        if(n == 1 && d == 0)
            return 2; 
        if(n == 1 && Math.abs(d) == 1)
            return 1; 
        int res = 2*countSeq(n-1, d) + countSeq(n-1, d-1) + countSeq(n-1, d+1);
        return res;
    }
    public int  compute_value(int n)
    {
        //JAI SHRI RAM 
        return countSeq(n, 0);
    }
}
