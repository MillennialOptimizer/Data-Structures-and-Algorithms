import java.lang.Math;
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
		if(k == 0)
			return (double)1; 
		double sumTillPrevTerm = findGeometricSum(k-1);
		double res = sumTillPrevTerm + (double)((double)1/(double)Math.pow(2, k));
		return res;
	}
}
