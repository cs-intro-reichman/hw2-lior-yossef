// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];

		int loopCount = 1;

		while (loopCount <= seed) {
			int num = loopCount;
			int stepsCount = 1;
			if (mode.equals("v")) {
				System.out.print(num + " ");
			}
			if (num == 1) {
				num = num * 3 + 1;
			}
			while (num != 1) {
				num = num % 2 == 0 ? num / 2 : num * 3 + 1;
				stepsCount++;
				if (mode.equals("v")) {
					System.out.print(num + " ");
				}
			}
			if (mode.equals("v")) {
				System.out.print("(" + stepsCount + ")\n");
			}
			loopCount++;

		}

		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
