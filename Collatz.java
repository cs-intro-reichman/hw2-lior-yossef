// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];

		int loopCount = 1;

		while (loopCount <= seed) {
			int num = loopCount;
			int stepsCount = 1;
			if (num == 1) {
				System.out.print(num + " ");
				num = num * 3 + 1;
				stepsCount++;
			}
			while (num != 1) {
				if (mode.equals("v")) {
					System.out.print(num + " ");
				}
				num = num % 2 == 0 ? num / 2 : num * 3 + 1;
				stepsCount++;
			}
			if (mode.equals("v")) {
				System.out.print(num + " (" + stepsCount + ")\n");
			}
			loopCount++;

		}

		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
