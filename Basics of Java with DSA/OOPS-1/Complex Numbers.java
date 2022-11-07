/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class
	//JAI SHRI RAM 
	public int real; 
	public int complex; 
	public ComplexNumbers(int real, int complex){
		this.real = real;
		this.complex = complex;
	}
	public void plus(ComplexNumbers c){
		real += c.real; 
		complex += c.complex;
	}
	public void multiply(ComplexNumbers c){
		int x = real*c.real - complex*c.complex; 
		int y = real*c.complex + complex*c.real;
		real = x;
		complex = y;
	}
	public void print(){
			System.out.println(real + " + i" + complex);
	}
}
