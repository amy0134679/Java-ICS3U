import java.util.Scanner;

	public class NANDGate{
		
		public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		boolean a = false;
		boolean b = false;
		boolean c = true;
		
		System.out.println("Please enter whether the value is on or off using true for yes, and false for no");
		a = keyboard.nextBoolean();
		System.out.println("Please true or false for the next value aswell:");
		b = keyboard.nextBoolean();
		
		c = !(a == true && b == true) || (a == false && b == false) ||  (a != true && b == true) || (a == true && b != true);
	
		System.out.println("your c value is going to be " + c +".");
	
		}
	}



BooleanTest

a
b
c
d
OUTPUT
0
0
0
0
FALSE
1
0
0
0
FALSE
1
1
0
0
TRUE
1
1
1
0
TRUE
1
1
1
1
TRUE
0
1
1
1
TRUE
0
0
1
1
TRUE
0
1
1
1
TRUE
0
1
0
1
FALSE
0
1
0
1
TRUE
1
0
1
0
TRUE
0
1
1
0
TRUE
1
0
0
1
FALSE
1
0
0
1
FALSE
1
1
1
1
TRUE


import java.util.Scanner;

	public class BooleanTest{
		
		public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean output = true;
		
		System.out.println("Please enter whether the value is on or off using true for yes, and false for no");
		a = keyboard.nextBoolean();
		System.out.println("Please true or false for the next value aswell:");
		b = keyboard.nextBoolean();
			System.out.println("Please true or false for the next value aswell:");
		c = keyboard.nextBoolean();
			System.out.println("Please true or false for the last value:");
		d = keyboard.nextBoolean();
		
		output = a && b == true || c && d == true || b && c == true ||  a && c == true | c && b == true;
		System.out.println("The output is " + output);
	
		}
	}

import java.util.Scanner;

public class LogicGates {


    public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
		boolean A = false;
		boolean B = false;
		boolean C = false;
		boolean D = false;
		boolean a = true;
		
		System.out.println("Please enter whether the value is on or off using true for yes, and false for no");
		A = keyboard.nextBoolean();
		System.out.println("Please true or false for the next value aswell:");
		B = keyboard.nextBoolean();
			System.out.println("Please true or false for the next value aswell:");
		C = keyboard.nextBoolean();
			System.out.println("Please true or false for the last value:");
		D = keyboard.nextBoolean();
		
		a = B 
			
			
    }
}



A
B
C
D


1























































If (! (!(D)  &&  B  ==  true)){
	pink = true}
If (A = 

    

If (NAND == (false + false || true + false) & false && false) {
                    Last NAND = 1}

