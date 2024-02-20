//CODE BY: GAVEN FRANCO
//DATE: 2/19/24
// DESCRIPTION: Calculates rainfall stats for multiple years, including total rainfall average rainfall per month, and the number of months with specific rainfall levels.in inches
import java.util.Scanner;
public class Rainfall {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the rainfall Calculator");
        System.out.println("Enter the amount of years you would like to calculate:");
        int numYears = keyboard.nextInt(); // Read the number of years from the user
        double aveRain = 0, aveRainAll = 0, rainYearTotal = 0, rainTotalAll = 0;
        int monthlyRain, rainYear3 = 0, rainYear10 = 0, rain30 = 0;

        for (int yearCurr = 1; yearCurr <= numYears; yearCurr++) { // Loops each year
            for (int monthCurr = 1; monthCurr <= 12; monthCurr++) { // Loops each month in the year
                System.out.println("How many inches of rain in year " + yearCurr + ", month " + monthCurr + "?");
                monthlyRain = keyboard.nextInt(); 
                rainYearTotal += monthlyRain; // Adds rainfal to the total for the year
                rainTotalAll += monthlyRain; // Adds rainfall to the total for all years
                if (monthlyRain <= 3) {
                    rainYear3++; // Increments count of months with 3 or less inches of rain for the year
                    rain30++; // Increments count of months with 3 or less inches of rain for all years
                } else if (monthlyRain >= 10) {
                    rainYear10++; // Increments count of months with 10 or more inches of rain for the year
                }
            }
            aveRain = rainYearTotal / 12; // Calculates average rainfall for the year
            System.out.println("\nThe total rainfall for year " + yearCurr + " was " + rainYearTotal + " inches.");
            System.out.println("The average rainfall per month in year " + yearCurr + " was " + aveRain + " inches.");
            System.out.println("The total amount of months in year " + yearCurr + " that had 3 or less inches of rain was " + rainYear3);
            System.out.println("The total amount of months in year " + yearCurr + " that had 10 or more inches of rain was " + rainYear10);
            //Rests the counters
            rainYearTotal = 0; 
            rainYear3 = 0; 
            rainYear10 = 0; 
        }
        aveRainAll = rainTotalAll / (12 * numYears); // Calculates average rainfall for all years

        System.out.println("\nThe total rainfall for all years was " + rainTotalAll + " inches.");
        System.out.println("The average rainfall per month for all years was " + aveRainAll + " inches.");
        System.out.println("The total amount of months for all years that had 3 or less inches of rain was " + rain30);
        System.out.println("The total amount of months for all years that had 10 or more inches of rain was " + rainYear10);
    }
}
