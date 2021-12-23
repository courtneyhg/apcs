public class Driver {

	public static void main(String[] args) {
		// Rational z = new Rational(5, 10);
		// Rational x = new Rational(8, 9);
		// String joemama = new String("licky");
		//
		// System.out.println(z.equals(x));
		// System.out.println(z.compareTo(x));
		// System.out.println(z.equals(joemama));
		// System.out.println(z.compareTo(joemama));

		Rational a = new Rational(3, 7);
		Rational b = new Rational(8, -5);
		String bob = new String("no");

		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.equals(bob));
		System.out.println(a.compareTo(bob));
}
}
