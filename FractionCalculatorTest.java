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
		System.out.println("Enter input:");
		String str = System.console().readLine();
		calc.evaluate(f, str);

		//test makeFraction()
		/*String make = "3/4";
		Fraction madeFraction = calc.makeFraction(make);
		System.out.println(madeFraction);*/
	}
}