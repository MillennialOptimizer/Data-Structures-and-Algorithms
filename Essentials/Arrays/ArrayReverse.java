class Solution {
    public void reverseString(char[] s) {
        int n = s.length; 
        int l = 0, r = n - 1; 
        while(r >= l){
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            r = r - 1;
            l = l + 1;
        }
    }
}
