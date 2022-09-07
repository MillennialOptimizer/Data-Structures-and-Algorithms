import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int cntr = 1, i = 0; 
		while(i < x){
            int num = 3*cntr + 2;
            cntr++;
            if(num%4 == 0){
                continue;
            }
            System.out.print(num + " ");
            i++;
        }
	}
}
