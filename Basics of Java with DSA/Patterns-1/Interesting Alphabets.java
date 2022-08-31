import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char ch = (char)('A' + n - 1);
        for(int i = 1; i <= n; i++){
            char nch = (char)(ch - (i - 1));
            for(int j = 0; j < i; j++){
                System.out.print(nch);
                nch = (char)(nch + 1);
            }
            System.out.println("");
        }
	}
}
