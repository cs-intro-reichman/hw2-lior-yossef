// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		String str = "";

		for (int i = 1; i <= seed; i++) {
			int num = i;
			int stepsCount = 1;

			if (num == 1) {
				str += num + " ";
				num = num * 3 + 1;
				stepsCount++;
			}

			while (num != 1) {
				str += num + " ";
				num = num % 2 == 0 ? num / 2 : num * 3 + 1;
				stepsCount++;
			}

			str += num + " (" + stepsCount + ")";
			if (i != seed) {
				str += "\n";
			}
		}

		if (mode.equals("v")) {
			System.out.println(str);
		}

		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
