import java.util.Scanner;

public class LogicGates {

   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		
		System.out.println("Enter whether the value is on or off using true for on, and false for off");
		a = keyboard.nextBoolean();
		System.out.println("Enter true or false for the next value aswell:");
	            b = keyboard.nextBoolean();
		System.out.println("Enter true or false for the next value aswell:");
		c = keyboard.nextBoolean();
		System.out.println("Enter true or false for the last value:");
		d = keyboard.nextBoolean();
			 
		boolean output = b && !d && !a && !c == true || !b && !c && d && !a == true
			 || !a && !b && !c && !d == true || a && c && !d && !b == true;
			 
		System.out.println("The output will be: " + output);
		
    }
}


