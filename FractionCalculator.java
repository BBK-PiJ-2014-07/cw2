/**
Sophie Koonin skooni01
*/

public class FractionCalculator {
	private Fraction value;
	private int operator;

	public FractionCalculator(){
	value = new Fraction(0,1);
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
		value = makeFraction(splitInput[0]);
		for (int i = 1; i < splitInput.length; i+=2) {
			if (splitInput[i].equals("+")) {
				operator = 1;
			} else if (splitInput[i].equals("-")) {
				operator = 2;
			} else if (splitInput[i].equals("*")) {
				operator = 3;
			} else if (splitInput[i].equals("/")) {
				operator = 4;
			} else if (splitInput[i].equals("abs") || splitInput[i].equals("a")  || splitInput[i].equals("A")) {
				if (operator != 0) {
					//error and reset
				} else {
					value.absValue();
				}
			}
			System.out.println(operator);
			Fraction nextFraction = makeFraction(splitInput[i+1]);
			//System.out.println(nextFraction);
			switch (operator) {
				case 1:
				value = value.add(nextFraction);
				System.out.println(value);
							
				case 2:
				value = value.subtract(nextFraction);
				
				case 3:
				value = value.multiply(nextFraction);
			
				case 4:
				value = value.divide(nextFraction);
			
				default:
				//System.out.println(value);
			}
			//assign result to value
		}
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