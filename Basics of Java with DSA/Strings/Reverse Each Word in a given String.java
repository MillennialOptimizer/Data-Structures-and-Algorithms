class Solution
{
    String reverse(String s){
        String res = "";
        for(int i = s.length()-1; i >= 0; i--){
            res += s.charAt(i) + "";
        }
        return res;
    }
    String reverseWords(String s)
    {
        // your code here
        int n = s.length(); 
        StringBuilder word = new StringBuilder();
        String res = "";
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '.'){
                String reversedWord = reverse(word.toString());
                res += reversedWord; 
                res += ".";
                word = new StringBuilder();
            }
            else if(i == n-1){
                word.append(s.charAt(i));
                String reversedWord = reverse(word.toString());
                res += reversedWord; 
                word = new StringBuilder();
            }
            else{
                word.append(s.charAt(i));
            }
        }
        return res;
    }
}
