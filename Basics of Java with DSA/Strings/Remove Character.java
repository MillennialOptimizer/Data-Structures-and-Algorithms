
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        StringBuffer s = new StringBuffer(str);
        int j = 0; 
        for(int i = 0; i < s.length(); i++){
            while(i < s.length() && s.charAt(i) == ch){
                i++;
            }
            if(i < s.length())
            {
                s.setCharAt(j, s.charAt(i));
            	j++;
            }
        }
        return s.substring(0,j).toString();
	}

}
