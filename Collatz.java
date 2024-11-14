// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		String stepsStr;

		for (int i = 1; i <= seed; i++) {
			int num = i;
			int stepsCount = 1;
			stepsStr = "";

			do {
				stepsStr += num + " ";
				num = num % 2 == 0 ? num / 2 : num * 3 + 1;
				stepsCount++;
			} while (num != 1);

			stepsStr += num + " (" + stepsCount + ")";

			if (mode.equals("v")) {
				System.out.println(stepsStr);
			}
		}

		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
