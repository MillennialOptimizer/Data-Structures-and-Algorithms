import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i <= n/2; i++){
            int spaces = (n/2) - i;
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i+1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = (n/2)-1; i >= 0; i--){
            int spaces = (n/2) - i;
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
