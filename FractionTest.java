/**
 * Created by keith for the second coursework assignment.
 */
public class FractionTest {
    public static void main(String[] args) {

        // test divide by zero - should print an error and exit
        new Fraction(1, 0);
        // test add
	Fraction f = new Fraction(17,20);
	Fraction g = new Fraction(1,4);
	Fraction h = new Fraction(3,5);
	if (!f.equals(g.add(h))) System.out.println("Add failed");

	//test subtract
		Fraction j = new Fraction(7,20);
	Fraction k = new Fraction(3,5);
	Fraction l = new Fraction(1,4);
	if (!j.equals(k.subtract(l))) System.out.println("Subtract failed");

	//test multiply
		Fraction m = new Fraction(3,10);
	Fraction n = new Fraction(1,2);
	Fraction o = new Fraction(3,5);
	if (!m.equals(n.multiply(o))) System.out.println("Multiply failed");

	//test divide
		Fraction p = new Fraction(7,8);
	Fraction q = new Fraction(7,10);
	Fraction r = new Fraction(4,5);
	if (!p.equals(q.divide(r))) System.out.println("Divide failed");

	// test aesvalus
	Fraction neg = new Fraction(-3,5);
	System.out.println(neg.absValue().toString());
	Fraction neg1 = new Fraction(-2,3);
	System.out.println(neg1.absValue().toString());
	Fraction neg2 = new Fraction(-1,2);
	System.out.println(neg2.absValue().toString());

	// test toString
	Fraction big = new Fraction(4,1);
	System.out.println(big.toString());

	//test negate
	System.out.println(m.negate().toString());

        // test equals
	test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
	test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
	test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
	test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
	test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");

        // extend with extra tests
    }

    static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
    }
}
