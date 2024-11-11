// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String str = args[0].toUpperCase();
                int printLimit = Integer.parseInt(args[1]);

                String anChars = "AEFHILMNORSX";

                int index = 0;
                int printCount = 0;

                while (index < str.length()) {
                        char character = str.charAt(index);
                        System.out.println("Give me " + (anChars.indexOf(character) != -1 ? "an  " : "a  ") + character + ": " + character + "!");
                        index++;
                }

                System.out.print("What does that spell?\n");

                while (printCount < printLimit) {
                        System.out.println(str + "!!!");
                        printCount++;
                }
        }
}
