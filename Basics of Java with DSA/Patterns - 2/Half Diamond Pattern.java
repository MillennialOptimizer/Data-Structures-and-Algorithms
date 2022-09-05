import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 0){
            System.out.println("*");
            System.out.println("*");
            return;
        }
        for(int i = 0; i <= n; i++){
            if(i == 0){
                System.out.println("*");
                continue;
            }
            System.out.print("*");
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = i-1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println("*");
        }
        for(int i = n-1; i >= 0; i--){
            if(i == 0){
                System.out.println("*");
                continue;
            }
            System.out.print("*");
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = i-1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println("*");
        }
    }
}
