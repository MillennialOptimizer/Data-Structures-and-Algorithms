
public class Solution {
	public static int checkFirstIndexTillIEle(int[] input, int x, int i){
		if(i < 0){
			return -1;
		}
		int checkTillPrevEle = checkFirstIndexTillIEle(input, x, i-1);
		if(checkTillPrevEle != -1){
			return checkTillPrevEle;
		}
		else if(input[i] == x){
			return i;
		}
		else{
			return -1;
		}
	}
	public static int firstIndex(int input[], int x) {
		int n = input.length; 
		return checkFirstIndexTillIEle(input, x, n-1);
	}
	
}
