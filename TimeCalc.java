public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = minutes + minutesToAdd;
        int newHours = (hours + (totalMinutes / 60)) % 24;
        int newMinutes = totalMinutes % 60;

        String hoursStr = newHours < 10 ? "0" + newHours : "" + newHours;
        String minutesStr = newMinutes < 10 ? "0" + newMinutes : "" + newMinutes;

        System.out.println(hoursStr + ":" + minutesStr);
    }
}
