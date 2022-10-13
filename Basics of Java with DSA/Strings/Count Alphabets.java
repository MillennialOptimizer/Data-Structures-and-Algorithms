class Solution{
    static int Count(String s)
    {
        // code here
        int cntr = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i); 
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            cntr++;
        }
        return cntr;
    }
}
