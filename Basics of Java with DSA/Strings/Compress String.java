public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        StringBuffer s = new StringBuffer();
          int j = 0; 
          for(int i = 0; i < str.length(); i++){
              int freq = 1;
              j = i; 
              while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                  freq++;
                  i++;
              }
              s.append(str.charAt(i));
              if(freq > 1)
              	s.append((char)('0' + freq));
          }
          return s.toString();
	}

}
