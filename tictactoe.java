import java.util.Scanner;
import java.math.BigDecimal;

public class AmbigiousCase {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double angleA = 0.0;
		double a = 0.0;
		double b = 0.0;
		double h = 0.0;
	
		System.out.println("Please enter an angle value in degrees:");
		angleA = keyboard.nextDouble ();
		System.out.println("Please enter a side value:");
		a = keyboard.nextDouble ();
		System.out.println("Please enter another side value:");
		b = keyboard.nextDouble ();
		h = b * Math.sin(Math.toRadians(angleA));
		
		BigDecimal hDecimal = BigDecimal.valueOf(h);
	/*	BigDecimal h = new BigDecimal(0.0);
		hDecimal = BigDecimal.valueOf(h);
		hDecimal = hDecimal.setScale(3, RoundingMode.HALF_UP);
		h = hDecimal.doubleValue();*.*/ 
	    
		if (angleA < 90) { 
			if(a == h) {
				System.out.println("It is a right triangle");
			} else if (a >= b) {
				System.out.println("There is one triangle");
			} else if (h < a && a < b) {	
				System.out.println("There is two triangles, it is an ambiguous   case");
			} else {
				System.out.println("There is no triangle");
			}
		} else if (angleA > 90) {
			if (a <= b || a == h) {
				System.out.println("There is no triangle");
			} else {
				System.out.println("There is one triangle");
			}
		} else {
			System.out.println("There is no triangle");
		}	
	}
}		

