import java.util.Scanner;
public class Main {
	public static long roundOff(double val){
        int x = (int)(val*10)%10; 
        if(x >= 5){
            return (long)(val+1);
        }
        return (long)val;
    }
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        String gradeStr = s.next();
        char grade = gradeStr.charAt(0);
        double hra = 0.2*basic, da = 0.5*basic, pf = 0.11*basic, allow; 
        if(grade == 'A'){
            allow = 1700.0; 
        }
        else if(grade == 'B'){
            allow = 1500.0;
        }
        else{
            allow = 1300.0;
        }
        double salary = (basic + hra + da + allow - pf); 
        long ans = roundOff(salary);
        System.out.println(ans);
	}
}
