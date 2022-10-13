class Solution {
    int isPalindrome(String s) {
        // code here
        int n = s.length();
        int l = 0, r =n-1; 
        while(r >= l){
            if(s.charAt(r) != s.charAt(l)){
                return 0;
            }
            r--;
            l++;
        }
        return 1;
    }
};
