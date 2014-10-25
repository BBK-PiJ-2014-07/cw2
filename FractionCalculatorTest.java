/**
Sophie Koonin skooni01
*/
import java.io.*; 

public class FractionCalculatorTest {

	public static void main(String[] args) {
		FractionCalculatorTest fc = new FractionCalculatorTest();
		FractionCalculator calc = new FractionCalculator();

		//initialise value of calculator to 0
		Fraction f = new Fraction(0,1);
	
			//print a welcome message
			calc.initCalc();
			//while loop to keep it going
			while (true){
				try {
					String str = System.console().readLine();
					f = calc.evaluate(f, str);
					System.out.println(f);
				} catch (NullPointerException e) {
					System.out.println("Goodbye.");
					System.exit(0);
				} catch (Exception e) {
					System.out.println("Error!");
					calc.resetCalc(f);
				
				}
		}
	}
	
}