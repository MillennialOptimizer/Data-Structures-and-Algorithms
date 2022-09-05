import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 2*i+1; j < 2*n; j+=2){
                System.out.print(j);
            }
            for(int j = 0; j < 2*i; j++){
                if(j%2 != 0){
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
	}
}
