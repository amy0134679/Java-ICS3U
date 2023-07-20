import java.util.Scanner;

public class PowerRule {

	public static void calcDiscriminant(String[] coeff, String[] degree, String derivative) {
	
		System.out.print(derivative);
		
		     	for (int i = 0; i < coeff.length; i++) {
		       		
		       		coeff[i] = Double.toString((Double.parseDouble(coeff[i])) * Double.parseDouble(degree[i]));
		       		degree[i] = Double.toString(Double.parseDouble(degree[i]) - 1.0);
		       		
		       		if ( i > 0 && Double.parseDouble(coeff[i]) >= 0.0) {
		       			 System.out.print(" +");
		       		} 
		       		if (Double.parseDouble(degree[i]) == 0.0) {
		       			System.out.print((coeff[i]));		
		       		} else {
		       			System.out.print((coeff[i]) + "x^" + (degree[i]));
		    }
		} 
	}	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] coeff;
		String[] degree;
			
		System.out.println("Enter the polynomial's coefficients with spaces in between");
		coeff = keyboard.nextLine().split(" ");
		System.out.println("Enter the polynomial's degrees with spaces in between");
		degree = keyboard.nextLine().split(" ");
		
		String derivative = " f(x)'= ";
		calcDiscriminant (coeff, degree, derivative);
		derivative = "\n f(x)''= ";
		calcDiscriminant (coeff, degree, derivative);
	}	
}


