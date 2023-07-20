import java.util.Scanner;

public class AsymptoteFinder {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int m = 0;
		int n = 0;
		int differnce = 0;

		System.out.println("Please enter a m value:");
		m = keyboard.nextInt ();
		System.out.println("Please enter a n value:");
		n = keyboard.nextInt ();
		
		if (m == n) {
			System.out.println("The asymptote is horizontal");
		} else if (m < n) {
			System.out.println("The asymptote is the x-axis");
		} else {
			int difference = m - n;
				switch (difference){
					case 1:
						System.out.println("The asymptote is linear");
						break;
					case 2:
						System.out.println("The asymptote is quadratic");
						break;
					case 3:
						System.out.println("The asymptote is cubic");
						break;
					case 4:
						System.out.println("The asymptote is quartic");
						break;
					case 5:
						System.out.println("The asymptote is quintic");
						break;
					case 6:
						System.out.println("The asymptote is sextic");
						break;
					case 7:
						System.out.println("The asymptote is septic");
						break;
					case 8:
						System.out.println("The asymptote is optic");
						break;
					case 9:
						System.out.println("The asymptote is nonic");
						break;
					case 10:
						System.out.println("The asymptote is decic");
						break;		
							
			}	
		}
	}
}

