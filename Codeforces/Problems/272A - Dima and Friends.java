import java.util.*;
public class Siddharth{
    public static void main(String[] args){
        // your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n]; 
		int sum = 0;
		for(int i = 0; i < n; i++){
		    a[i] = s.nextInt();
		    sum += a[i];
		}
		int ans = 0;
		for(int i = 1; i <= 5; i++){
		    if((sum + i)%(n+1) != 1){
		        ans++;
		    }
		}
		
		System.out.println(ans);
    }
}
