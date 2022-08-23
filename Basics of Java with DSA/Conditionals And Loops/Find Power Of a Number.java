import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        long prod = 1, i = 1; 
        while(i <= n){
            prod = prod*x;
            i++;
        }
        System.out.println(prod);
    }
}
