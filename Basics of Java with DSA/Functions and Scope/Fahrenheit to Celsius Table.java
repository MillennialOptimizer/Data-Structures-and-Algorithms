import java.util.Scanner;
public class Solution {
    
	public static int ConvertToCelsius(int fahrenheit){
        int celsius = ((fahrenheit - 32) *5)/9;
        return celsius;
    }
    
	public static void printFahrenheitTable(int start, int end, int step) {
		
        for(int i = start; i <= end; i+=step){
            int x = ConvertToCelsius(i);
            System.out.println(i + "\t" + x);
        }
	}
}
