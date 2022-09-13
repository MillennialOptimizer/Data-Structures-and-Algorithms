import java.lang.Math;
public class Solution {
	
    public static boolean isPerfectSquare(int n){
        double x = Math.sqrt(n);
        int y = (int)Math.sqrt(n);
        if(x - y == 0){
            return true;
        }
        return false;
    }
    
	public static boolean checkMember(int n){
        int x = 5*n*n - 4; 
        int y = 5*n*n + 4; 
        if(isPerfectSquare(x) || isPerfectSquare(y))
            return true;
        return false;
	}
	

}
