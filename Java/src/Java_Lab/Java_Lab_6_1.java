package Java_Lab;

public class Java_Lab_6_1 {
    public static void main(String[] args) {
        String timeString = "2hrs and 5 minutes";
        calculateTime(timeString);
    }

        public static void calculateTime(String timeString) {

            String[] timeNumbers = timeString.split("and");

            String hourNumStr = timeNumbers[0].replaceAll("[^0-9]", "");

            String minuteNumStr = timeNumbers[1].replaceAll("[^0-9]", "");

            int hrNum = Integer.parseInt(hourNumStr);
            int minNum = Integer.parseInt(minuteNumStr);

            int totalMinutes = hrNum * 60 + minNum;
            System.out.printf("Total: %d %s", totalMinutes, "minute(s)");
        }
}

