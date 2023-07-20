String numOfRoots = "";import java.util.Scanner;

public class ModifiedQuadraticFormula {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		var a = 0.0;
		var b = 0.0;
		var c = 0.0;
		var root1 = 0.0;
		var root2 = 0.0;

		
		System.out.println("Please enter an a value:");
		a = keyboard.nextDouble();
		System.out.println("Please enter a b value:");
		b = keyboard.nextDouble();
		System.out.println("Please enter a c value:");
		c = keyboard.nextDouble();
		
		root1 = (-b + Math.sqrt(b * b  - 4 * a * c)) / (2 * a);
		root2 = (-b - Math.sqrt(b * b  - 4 * a * c)) / (2 * a);
		
		System.out.println("Root 1 is: " + root1);
		System.out.println("Root 2 is: " + root2);
	
		if(b * b  - 4 * a * c < 0) {
			numOfRoots = "There are no real roots";
			System.out.println(numOfRoots);	
		} else if (b * b  - 4 * a * c > 0) {
			numOfRoots = "There are two real roots";
			System.out.println(numOfRoots);
		} else if (b * b  - 4 * a * c == 0) {
			numOfRoots = "There is a unique root;
			System.out.println(numOfRoots);
	
		}	
	}	
}



