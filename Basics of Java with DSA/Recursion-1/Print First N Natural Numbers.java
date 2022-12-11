public class Solution {

	public static void print(int n){
		//Write your code here
		if(n == 1)
		System.out.print("1 ");
		else{
			print(n-1);
			System.out.print(n + " ");
		}
	}


}
