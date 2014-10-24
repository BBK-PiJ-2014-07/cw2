/**
Sophie Koonin skooni01
*/
import java.io.*; 

public class FractionCalculatorTest {

	public static void main(String[] args) {
		FractionCalculatorTest fc = new FractionCalculatorTest();
	
		Fraction f = new Fraction(0,1);
		FractionCalculator calc = new FractionCalculator();
		//try {
		//print a welcome message
		System.out.println("------------------------------------------");
		System.out.println("FRACTION CALCULATOR");
		System.out.println("------------------------------------------");
		System.out.println("PiJ Coursework by Sophie Koonin");
		System.out.println("Enter fractions as numbers separated by a slash,\nand your chosen operator, separated by spaces.");
		System.out.println("Accepted inputs: + - * /");
		System.out.println("abs, A, a: get absolute value \nneg, N, n: negate fraction");
		System.out.println("quit, Q, q: quit program");
		System.out.println("------------------------------------------");
		System.out.println("Enter input:");

		//while loop to keep it going
		while (true){
		String str = System.console().readLine();
		f = calc.evaluate(f, str);
		System.out.println(f);
		}


		/*} catch (EOFException e) {
			System.out.println("Goodbye.");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Error!");
			calc.resetCalc();
		*/


	}	//test makeFraction()
		/*String make = "3/4";
		Fraction madeFraction = calc.makeFraction(make);
		System.out.println(madeFraction);*/
	
}