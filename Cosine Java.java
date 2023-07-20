import java.util.Scanner;

public class CosineLaw {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double A = 0.0;
		
		System.out.println("Please enter side a value:");
		a = keyboard.nextDouble();
		System.out.println("Please side b value:");
		b = keyboard.nextDouble();
		System.out.println("Please angleC value in degrees:");
		angleC = keyboard.nextDouble();
		angleC = (Math.toRadians(angleC));
		
		c = Math. sqrt(a * a + b * b - (2 * a * b * Math.cos(angleC)));

		System.out.println(" The value of side c is " + c + " units")  ;
	
	}
}
