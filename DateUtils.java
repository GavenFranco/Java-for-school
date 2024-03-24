//CODE BY GAVEN FRANCO
//DATE: 3/24/2024
//DESCRIPTION: Program for calculating dates and converting Gregorian and julian calendars and formats dates.
import java.util.Scanner;

public class DateUtils {

    public static void main(String[] args) {
        DateCalculator dateCalculator = new DateCalculator();
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        //Main loop to display menu options also looks at user input
        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Convert Gregorian date to Julian date");
            System.out.println("2. Convert Julian date to Gregorian date");
            System.out.println("3. Add/subtract days to/from a date");
            System.out.println("4. Format date string");
            System.out.println("5. Calculate days between two dates");
            System.out.println("6. Exit");

            int option = keyboard.nextInt();
            keyboard.nextLine(); // Consume newline

            switch (option) {
                case 1: 
                    // Converts Gregorian Date to Julian Date
                    System.out.println("Enter Gregorian date (mm/dd/yyyy):");
                    String gregorianDate1 = keyboard.nextLine();
                    int julianDate = dateCalculator.convertToJulian(gregorianDate1);
                    System.out.println("Julian date: " + julianDate);
                    break;
                case 2:
                    //Convert Julian date to Gregorian
                    System.out.println("Enter Julian date (yyyyddd):");
                    int julianDate2 = keyboard.nextInt();
                    keyboard.nextLine(); // Consume newline
                    String gregorianDate = dateCalculator.convertToGregorian(julianDate2);
                    System.out.println("Gregorian date: " + gregorianDate);
                    break;
                case 3:
                    //Adds and subtracts days to and from datee
                    System.out.println("Enter Gregorian date (mm/dd/yyyy):");
                    String gregorianDate3 = keyboard.nextLine();
                    System.out.println("Enter number of days to add/subtract:");
                    int days = keyboard.nextInt();
                    keyboard.nextLine(); // Consume newline
                    String newDate = dateCalculator.addSubtractDays(gregorianDate3, days);
                    System.out.println("New date: " + newDate);
                    break;
                case 4:
                    //Format date 
                    System.out.println("Enter Gregorian date (mm/dd/yyyy):");
                    String gregorianDate4 = keyboard.nextLine();
                    String formattedDate = dateCalculator.formatDateString(gregorianDate4);
                    System.out.println("Formatted date: " + formattedDate);
                    break;
                case 5:
                    // Calculates days between two dates
                    System.out.println("Enter start Gregorian date (mm/dd/yyyy):");
                    String startDate = keyboard.nextLine();
                    System.out.println("Enter end Gregorian date (mm/dd/yyyy):");
                    String endDate = keyboard.nextLine();
                    int daysDifference = dateCalculator.daysDifferent(startDate, endDate);
                    System.out.println("Days between the two dates: " + daysDifference);
                    break;
                case 6:
                    //exits program
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        keyboard.close();
    }
}
