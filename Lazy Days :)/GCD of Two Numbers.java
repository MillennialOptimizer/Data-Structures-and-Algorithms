class Solution
{
    public int gcd(int a , int b) 
    { 
        //code here
        while(a != 0 && b != 0){
            int min, max;
            if(a > b){
                max = a;
                min = b;
            }
            else{
                max = b;
                min = a; 
            }
            a = min;
            b = max%min;
        }
        if(a == 0)
            return b;
        else
            return a;
    } 
}
