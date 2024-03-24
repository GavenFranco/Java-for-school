//CODE BY: GAVEN FRANCO
//DATE: 03/08/2024
//DESCRIPTION: this program stores input in an array calcuates, averages, highest and lowest. loop ends when -1 is entered


import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        // Sets up all variables to be used in the array and processing
        final int ARRAY_SIZE = 21;
        int[] arrayNumber = new int[ARRAY_SIZE];
        int highestNum = 0; 
        int lowestNum = 2147483647; 
        int numLoop = 0; 
        int loopCount = 0;
        double aveArrayNum = 0; 
        double arrayTotal = 0;
        //Welcomes the user and prompts for input
        System.out.println("Welcome Array Processing do-dad");
        System.out.println("Enter the value of your number (enter -1 to quit)");

        for (int i = 1; i < ARRAY_SIZE; i++){
            System.out.printf("Enter the value of array number " + i + ": ");
            numLoop = keyboard.nextInt();
            keyboard.nextLine();
            // Checks if the user wants to quit -1
            if (numLoop != -1){
                arrayNumber[i] = numLoop; //Stores entered num in the array
                if (arrayNumber[i] > highestNum){ //Updates highest number
                    highestNum = arrayNumber[i];
                }
                if (arrayNumber[i] < lowestNum){ //Updates lowest number
                    lowestNum = arrayNumber[i];
                }
                arrayTotal += arrayNumber[i]; //Updates total sum
                loopCount++; 
                aveArrayNum = arrayTotal / loopCount; //increments counter and finds average
            } else {
                i = 20; // If -1 is entered it quits the loop by making the sub set = 20 
            }
        }
        //Displays calculations
        System.out.println("\nThe highest number you entered was: " + highestNum);
        System.out.println("The lowest number you entered was: " + lowestNum);
        System.out.printf("The average of all the numbers entered was %.2f", aveArrayNum);
        System.out.println("\n Numbers you entered in reverse order:");
        //Displays numbers in array in reverse order
        for (int j = loopCount - 1; j >= 0; j--) {
            if (!(arrayNumber[j] == 0)) {
                System.out.printf(arrayNumber[j] + ", ");
            }
        }
        //End of program
        System.out.println("Thats All Folks!");
        keyboard.close();
    }
}
