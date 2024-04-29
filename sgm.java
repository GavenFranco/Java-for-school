//CODE BY: GAVEN FRANCO
//DATE: 4/29/2024
//DESCRIPTION.
import java.util.Scanner;
public class sgm{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean menu = true;
        while(true){
            System.out.println("----Welcome to Sgm---- ");
            System.out.println("1). Add Student.\n");
            System.out.println("2). View All Students.\n");
            System.out.println("3). Search Student.\n");
            System.out.println("4). Delete Student.\n");
            System.out.println("5). Save to File.\n");
            System.out.println("6). Load from File.\n");
            System.out.println("7). Exit the Program.\n");
            
            System.out.println("Please type the number of the function you would like to use (e.g. 1, 2, 3 etc..): ");
            
            int choice = keyboard.nextInt();
            
            
            switch(choice){
                
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                System.out.println("Exiting the program...\n");
                System.out.println("Done!");
                System.exit(0);
                break;
            default:
                System.out.println("Not a vaild choice. Please retry!\n");
                break;
                
                    
                
                
            }
        }
    }
}