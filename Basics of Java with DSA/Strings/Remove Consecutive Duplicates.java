class Solution{
    public String removeConsecutiveCharacter(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1))
                i++;
            res += "" + s.charAt(i);
        }
        return res;
    }
}
