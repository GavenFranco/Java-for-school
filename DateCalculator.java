//CODE BY GAVEN FRANCO
//DATE: 3/24/2024
//DESCRIPTION: Program for calculating dates and converting Gregorian and julian calendars and formats dates.
import java.text.DateFormatSymbols;

public class DateCalculator {
    // Array for days of the week
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //Converts a Gregorian dat to julain date
    public int convertToJulian(String gregorianDate) {
        String[] parts = gregorianDate.split("/");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        int julianDate = day;
        for (int i = 0; i < month - 1; i++) {
            julianDate += DAYS_IN_MONTH[i];
        }
        if (isLeapYear(year) && month > 2) {
            julianDate++;
        }
        return year * 1000 + julianDate;
    }
    //Converts a Julain date to gregorian date
    public String convertToGregorian(int julianDate) {
        int year = julianDate / 1000;
        int dayOfYear = julianDate % 1000;

        int month = 0;
        while (dayOfYear > DAYS_IN_MONTH[month]) {
            if (isLeapYear(year) && month == 1) {
                dayOfYear--;
            }
            dayOfYear -= DAYS_IN_MONTH[month];
            month++;
        }
        if (isLeapYear(year) && month == 1) {
            dayOfYear++;
        }
        return String.format("%02d/%02d/%04d", month + 1, dayOfYear, year);
    }
    //Adds or subtracts days from a date
    public String addSubtractDays(String gregorianDate, int days) {
        int julianDate = convertToJulian(gregorianDate);
        julianDate += days;
        return convertToGregorian(julianDate);
    }
    //Formats a date to a specific format
    public String formatDateString(String gregorianDate) {
        String[] parts = gregorianDate.split("/");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] weekdays = dfs.getWeekdays();
        String[] months = dfs.getMonths();

        return weekdays[getJulianDayOfWeek(convertToJulian(gregorianDate))] + ", " +
                months[month - 1] + " " + day + ", " + year;
    }
    //Calculates the differnce in days between two gregorain dates.
    public int daysDifferent(String startDate, String endDate) {
        int startJulianDate = convertToJulian(startDate);
        int endJulianDate = convertToJulian(endDate);

        return endJulianDate - startJulianDate - 1;
    }
    // Checks if the year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Gets the julian day of the week for a given julian date
    private int getJulianDayOfWeek(int julianDate) {
        return (julianDate + 1) % 7;
    }
}
