/**
Sophie Koonin skooni01
*/

public class FractionCalculatorTest {

	public static void main(String[] args) {
		FractionCalculatorTest fc = new FractionCalculatorTest();
		fc.run();
	}
	public void run() {
		Fraction f = new Fraction(1,5);
		FractionCalculator calc = new FractionCalculator();
		
		//print a welcome message
		System.out.println("FRACTION CALCULATOR");
		System.out.println("PiJ Coursework by Sophie Koonin");
		System.out.println("Enter fractions as numbers separated by a slash, \n and your chosen operator, separated by spaces.");
		System.out.println("Accepted inputs: + - * /");
		System.out.println("'Abs'/'A'/'a': get absolute value; 'Neg'/'N'/'n': negate fraction");
		System.out.println("Type 'quit' to quit.");
		System.out.println("Enter input:");
		String str = System.console().readLine();

		//test evaluate function
		calc.evaluate(f, str);

		//test makeFraction()
		/*String make = "3/4";
		Fraction madeFraction = calc.makeFraction(make);
		System.out.println(madeFraction);*/
	}
}