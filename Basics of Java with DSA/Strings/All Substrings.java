
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        int n = str.length(); 
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                String res = "";
                for(int k = i; k <= j; k++){
                    res += "" + str.charAt(k);
                }
                System.out.println(res);
            }
        }
	}

}
