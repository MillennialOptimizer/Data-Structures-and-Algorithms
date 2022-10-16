public class Solution {
	public static String reverseWordWise(String s) {
		// Write your code here
        StringBuffer str = new StringBuffer();
        int n = s.length(); 
        StringBuffer word = new StringBuffer();
        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(i == 0){
                word.append(ch);
                word.reverse();
                str.append(word);
                word = new StringBuffer();
            }
            else if(s.charAt(i) == ' '){
                word.reverse();
                str.append(word);
                str.append(' ');
                word = new StringBuffer();
            }
            else{
                word.append(ch);
            }
        }
        return str.toString();

	}
}
