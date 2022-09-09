import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev = Integer.MAX_VALUE;
        int flag = 0;
        for(int i = 0; i < n; i++){
            int x = s.nextInt();
            if(x >= prev){
                flag = 1;
            }
            if(flag == 1){
                if(x <= prev){
                    System.out.println("false");
                    return;
                }
            }
            prev = x;
        }
        System.out.println("true");
	}
}
