
public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
		//JAI SHRI RAM 
        StringBuilder s = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
        StringBuilder minString = new StringBuilder();
        int n = input.length();
        for(int i = 0; i < n; i++){
            if(input.charAt(i) == ' '){
                if(s.length() < minLen){
                    minLen = s.length();
                    minString = new StringBuilder(s);
                }
                s = new StringBuilder();
            }
            else if(i == n-1){
                s.append(input.charAt(i));
                if(s.length() < minLen){
                    minLen = s.length();
                    minString = new StringBuilder(s);
                }
                s = new StringBuilder();
            }
            else{
                s.append(input.charAt(i));
            }
        }
        return minString.toString();
	}
}
