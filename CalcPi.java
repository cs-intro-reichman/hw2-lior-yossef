// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int numOfTerms = Integer.parseInt(args[0]);

		double pi = 0;
		double denominator = 1.0;

		for (int i = 0; i < numOfTerms; i++) {
			double fraction = 1.0 / denominator;
			pi = i % 2 == 0 ? pi + fraction : pi - fraction;
			denominator += 2.0;
		}

		pi = pi * 4.0;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);
	}
}
