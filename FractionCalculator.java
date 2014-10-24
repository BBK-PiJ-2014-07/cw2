/**
Sophie Koonin skooni01
*/

public class FractionCalculator {
	private Fraction reset;
	private Fraction nextFraction;
	private int operator;

	public FractionCalculator(){
	reset = new Fraction(0,1);
	nextFraction = new Fraction(0,1);
	operator = 0;

	}

	public String getInput(){
		System.out.println("Please enter your calculation:");
		String input = System.console().readLine();
		return input;
	}


	public Fraction evaluate(Fraction fraction, String inputString){
			
			//split up the input and iterate over array to find fractions
			String[] splitInput = inputString.split("\\s");

			for (int i = 0; i < splitInput.length; i++) {
				if (i == 0 && fraction.equals(reset)) {
					if (Character.isDigit(splitInput[i].charAt(0)) || splitInput[i].charAt(0) == '-') {
					//if this is the first in the array, and is a fraction, it must be assigned to fraction
					fraction = makeFraction(splitInput[0]);
					}

				} else if (splitInput[i].equals("+")) {
					if (operator != 0) {
						resetCalc(fraction);
					} else {
					operator = 1; 
					}

				} else if (splitInput[i].equals("-")) {
					if (operator != 0) {
						resetCalc(fraction);
					} else {
					operator = 2;
					}

				} else if (splitInput[i].equals("*")) {
					if (operator != 0) {
						resetCalc(fraction);
					} else {
					operator = 3;
					}

				} else if (splitInput[i].equals("/")) {
					if (operator != 0) {
						resetCalc(fraction);
					} else {
					operator = 4; 
					}

				} else if (splitInput[i].equals("abs") || splitInput[i].equals("a")  || splitInput[i].equals("A")) {
					fraction = fraction.absValue();
					
				} else if (splitInput[i].equals("neg") || splitInput[i].equals("n")  || splitInput[i].equals("N")) {
					fraction = fraction.negate();
					
				} else if (splitInput[i].equals("clear") || splitInput[i].equals("c")  || splitInput[i].equals("C")) {
					resetCalc(fraction);
				
				} else if (splitInput[i].equals("quit") || splitInput[i].equals("q")  || splitInput[i].equals("Q")) {
					System.exit(0);
					break;

				} else if (i > 0 && Character.isDigit(splitInput[i].charAt(0))) {
					//if it contains a digit it must be a fraction.
						if (operator == 0) {
							//if there is no stored operator, assign this fraction to fraction
							fraction = makeFraction(splitInput[i]);

						} else {
							//if there is a stored operator, this is nextFraction
							nextFraction = makeFraction(splitInput[i]);

							//then do the operation
							switch (operator) {
							case 1:
							fraction = fraction.add(nextFraction);
							operator = 0;
							break; 

							case 2:
							fraction = fraction.subtract(nextFraction);
							operator = 0;
							break;
							
							case 3:
							fraction = fraction.multiply(nextFraction);
							operator = 0;
							break;

							case 4:
							fraction = fraction.divide(nextFraction);
							operator = 0;
							break;
						
							default:
							break;
							}
						}
				}  else {
					//if anything else is entered, reset and print an error message
					resetCalc(fraction);
					operator = 0;
					System.out.println("Error - invalid input.");
					break;
				}	

			}
			//return final value		
			return fraction;
		
	}

	public void initCalc(){
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
	}

	public void resetCalc(Fraction fraction) {
		fraction = reset;
	}

	public Fraction makeFraction(String s){
		//parse the string "x/y" as a fraction (x,y)
		String[] fractionString = s.split("\\/");
		if (fractionString.length == 1) {
			int num = Integer.parseInt(fractionString[0]);
			int denom = 1;
			return new Fraction(num,denom);
		} else {
			int num = Integer.parseInt(fractionString[0]);
			int denom = Integer.parseInt(fractionString[1]);
			return new Fraction(num,denom);
		}
	}
}