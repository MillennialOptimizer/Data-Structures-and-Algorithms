import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        char nameAsSingleCharacter = name.charAt(0);
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        System.out.println(nameAsSingleCharacter);
        int average = (m1 + m2 + m3)/3;
        System.out.print(average);
	}

}
