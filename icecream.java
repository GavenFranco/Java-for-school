// Code by: Gaven Franco
// Date: 1/29/24
// Java Icecream calculator

import java.util.Scanner;

public class icecream{
    public static void main (String[] args){
       // Creating scanner object to read input
       Scanner read = new Scanner(System.in);
       
        // Input for how many scoops were eaten
         System.out.println("How many scoops of Ice Cream did you eat: ");
         int scoops = read.nextInt();
        
             // Scoops x calories 
               int icecreamcal = 59;
               int scoopcal = scoops*icecreamcal;
      
        // Input for number of teaspoons fudge
         System.out.println("How many teaspoons of Hot Fudge:");
         int tspf = read.nextInt();
        
             // tsp x calories
               int fudgecal = 60;
               int tspcal = tspf*fudgecal;
              
     // Combines the total calorie count and prints output
     
     int totalcal = scoopcal+tspcal;
     System.out.println("You ate " + scoops + " scoops of Ice Cream.");
     System.out.println("You added " + tspf + " teaspoons of Fudge.");   
     System.out.println("You consumed " + totalcal + " calories");
     
    }
}
