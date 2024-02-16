//CODE BY: GAVEN FRANCO
//DATE: 2/13/2024
//DESCRIPTION: Takes the weight of the package (pkgWeight) and then multiplies that by the cost to ship. Giving you the cost to ship
import java.util.Scanner;
public class shipping{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Shipping Rate Calculator!\n");
        System.out.println("Please enter the weight of your package in pounds:");
        double pkgWeight = keyboard.nextDouble();
    //This sets up all the rates that will be used to compare and multplied
        final double rateOne = 1.10, rateTwo = 2.20, rateThree = 3.70, rateFour = 3.80;
        
        // this is the If statement that compares weight of the package to the weight class Ie. (2, 6, 10). If the comparison falls under the requirements It will excute the logic under the corresponding comparison. 
        if (pkgWeight <= 2 ){ 
            double rateXweight1 = pkgWeight * 1.10; // 1.10 is the price per pound
            System.out.printf("The cost to ship your package will be: $%.2f", rateXweight1);
        } else if (pkgWeight <= 6){
            double rateXweight2 = pkgWeight * 2.20; // 2.20 is the price per pound
            System.out.printf("The cost to ship your package will be: $%.2f", rateXweight2);
        } else if (pkgWeight <= 10){
            double rateXweight3 = pkgWeight * 3.70; // 3.70 is the price per pound
            System.out.printf("The cost to ship your package will be: $%.2f", rateXweight3);
        }else{
            double rateXweight4 = pkgWeight * 3.80; // 3.80 is the price per pund
            System.out.printf("The cost to ship your package will be: $%.2f", rateXweight4);
        } 
    } // end of method
} // end of class