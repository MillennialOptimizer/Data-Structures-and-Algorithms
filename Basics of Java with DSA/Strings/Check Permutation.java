class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int[] freqa = new int[256]; 
        int[] freqb = new int[256];
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i); 
            freqa[ch-'0']++;
        }
        for(int i = 0; i < b.length(); i++){
            char ch = b.charAt(i);
            freqb[ch-'0']++;
        }
        for(int i = 0; i < 256; i++){
            if(freqa[i] != freqb[i])
            return false;
        }
        return true;
    }
}
