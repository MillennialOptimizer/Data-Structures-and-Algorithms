
public class Solution {
	public static String reverse(String s){
        String res = "";
        for(int i = s.length()-1; i >= 0; i--){
            res += s.charAt(i) + "";
        }
        return res;
    }
	public static String reverseWordWise(String str) {
		//Your code goes here
        int n = str.length(); 
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        StringBuilder word = new StringBuilder();
        String res = "";
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == ' '){
                String reversedWord = reverse(word.toString());
                res += reversedWord; 
                res += " ";
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
