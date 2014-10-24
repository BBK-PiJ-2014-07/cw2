/**
Sophie Koonin skooni01
*/

public class FractionCalculator {
	private Fraction value;
	private Fraction reset;
	private Fraction nextFraction;
	private int operator;

	public FractionCalculator(){
	value = new Fraction(0,1);
	reset = new Fraction(0,1);
	nextFraction = new Fraction(0,1);
	operator = 0;

	}

	public String getInput(){
		System.out.println("Please enter your calculation:");
		String input = System.console().readLine();
		return input;
	}


	public void evaluate(Fraction fraction, String inputString){
		//split up the input and iterate over array to find fractions
		String[] splitInput = inputString.split("\\s");

		for (int i = 0; i < splitInput.length; i++) {
			if (i == 0) {
				if (Character.isDigit(splitInput[i].charAt(0)) || splitInput[i].charAt(0) == '-') {
				//if this is the first in the array, and is a fraction, it must be assigned to value
				value = makeFraction(splitInput[0]);
				}

			} else if (splitInput[i].equals("+")) {
				if (operator != 0) {
					resetCalc(value);
				} else {
				operator = 1; 
				}
			} else if (splitInput[i].equals("-")) {
				if (operator != 0) {
					resetCalc(value);
				} else {
				operator = 2;
				}
			} else if (splitInput[i].equals("*")) {
				if (operator != 0) {
					resetCalc(value);
				} else {
				operator = 3;
				}
			} else if (splitInput[i].equals("/")) {
				if (operator != 0) {
					resetCalc(value);
				} else {
				operator = 4; 
				}
			} else if (splitInput[i].equals("abs") || splitInput[i].equals("a")  || splitInput[i].equals("A")) {
				value = value.absValue();
				
			} else if (splitInput[i].equals("neg") || splitInput[i].equals("n")  || splitInput[i].equals("N")) {
				value = value.negate();
				
			} else if (splitInput[i].equals("clear") || splitInput[i].equals("c")  || splitInput[i].equals("C")) {
				value = reset; 
			
			} else if (splitInput[i].equals("quit") || splitInput[i].equals("q")  || splitInput[i].equals("Q")) {
				System.exit(0);

			} else if (i > 0 && Character.isDigit(splitInput[i].charAt(0))) {
				//if it contains a digit it must be a fraction. assign to nextFraction
				nextFraction = makeFraction(splitInput[i]);

				//then do the operation
				switch (operator) {
				case 1:
				value = value.add(nextFraction);
				operator = 0;
				break; 

				case 2:
				value = value.subtract(nextFraction);
				operator = 0;
				break;
				
				case 3:
				value = value.multiply(nextFraction);
				operator = 0;
				break;

				case 4:
				value = value.divide(nextFraction);
				operator = 0;
				break;
			
				default:
				break;
				}
			}  

		}
		
		//print final value		
		System.out.println(value);

		
		
	}

	public void resetCalc(Fraction fraction) {
		System.out.println("There is already an operator in the memory! Calculator will reset.");
		fraction = reset;
	}

	public Fraction makeFraction(String s){
		//parse the string "x/y" as a fraction (x,y)
		String[] fractionString = s.split("\\/");
		int num = Integer.parseInt(fractionString[0]);
		int denom = Integer.parseInt(fractionString[1]);
		return new Fraction(num,denom);
	}
/*
	public void getOperator(String s){
		if (s == "+") {
			operator = "add";
		} else if (s == "-") {
			operator = "subtract";
		} else if (s == "*") {
			operator = "multiply";
		} else if (s == "/") {
			operator = "divide";
		} else {
			System.out.println("Invalid operator.");
		}
	}

	public Fraction evaluate(Fraction fraction, String inputString){
		if (operator == "add") {
			return f1.add(f2);
		} else if (operator == "subtract") {
			return f1.subtract(f2);
		} else if (operator == "multiply") {
			return f1.multiply(f2);
		} else if (operator == "divide") {
			return f1.divide(f2);
		} else {
			System.out.println("Calculation failed.");
			return f1; 
		}
	}
*/

	/*public static void main(String[] args){
	FractionCalculator calculator = new FractionCalculator();
	calculator.run();
	
	}
	
	public void run(){
		//get input from user
		parseString(getInput());
		System.out.print("Result: " + doCalculation(firstFraction, secondFraction, operator).toString());
		//split the string according to content


	}*/
}