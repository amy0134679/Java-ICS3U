import java.util.Scanner;

public class ISBNChecker {
        
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String isbnNumber = "";
        int sum = 0;
        
        loop:
        while (true) {
			System.out.println("Please enter an ISBN number [Enter q to quit]:");
	        isbnNumber = keyboard.nextLine();
	        
	        if (isbnNumber.length() == 1 && isbnNumber.toLowerCase().charAt(0) == 'q') {
	        	break loop;
	        }
	        
	        if (isbnNumber.length() != 13) {
	        	System.out.println("Please enter a valid ISBN number!");
	        	continue loop;
	        }
	        
	        for (int i = 0; i < isbnNumber.length(); i++) {
	        	if (!Character.isDigit(isbnNumber.charAt(i))) {
	        		System.out.println("Non-integer found in ISBN number!");
	        		continue loop;
	        	}
	        	if (i % 2 == 0) {
	        		sum += 1 * (int) isbnNumber.charAt(i);
	        	} else {
	        		sum += 3 * (int) isbnNumber.charAt(i); 
	        	}
	        }
			System.out.println("ISBN validity: " + (sum % 10 == 0));
        }
    }
}

