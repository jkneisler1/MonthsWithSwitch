import java.util.Scanner;

public class MonthsWithSwitch {
    public static void main(String[] args) {
        int monthDays;
        String months;

        Scanner keyboard = new Scanner(System.in);

        monthDays = keyboard.nextInt();

        switch (monthDays) {
            case 28:    months = "February";
                        break;
            case 29:    months = "February, only during a leap year.";
                        break;
            case 30:    months = "April, June, September, November";
                        break;
            case 31:    months = "January, March, May, July, August, October, December";
                        break;
            default:    months = "No month has exactly " + monthDays + " days.";
                        break;
        }

        System.out.println(months);
    }
}
