
public class Solution {

	public static char highestOccuringChar(String line) {
		//Your code goes here
        int[] freq = new int[256];
        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            freq[ch]++;
        }
        int maxEle = Integer.MIN_VALUE; 
        char maxChar = '0';
        for(int i = 0; i < 256; i++){
            if(maxEle < freq[i]){
                maxEle = freq[i];
                maxChar = (char)(i);
            }
        }
        return maxChar;
	}

}
