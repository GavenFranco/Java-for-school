// CODE BY: GAVEN FRANCO
// DATE 2/27/2024
// DESCRIPTION: STORES USER INPUT INTO THREE OBEJECTS WHICH THEN ARE DISPLAYED AFTER INFORMATION ABOUT ALL EMPLOYEE DATA HAS BEEN GATHERED.
import java.util.Scanner;

public class EmployeeInf {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        //Setting up Employee objects
        Employee Employee1 = new Employee();
        Employee Employee2 = new Employee();
        Employee Employee3 = new Employee();

        //Gathers data from user input about the employees and stores them in the objects to be used later in the displaying part of the program.
        System.out.println("Wellcome to employeeINFO!");
        System.out.println("Enter the name of employee 1");
        Employee1.setName(keyboard.nextLine());
        System.out.println("Enter the ID of employee 1");
        Employee1.setIdNumber(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the department of employee 1");
        Employee1.setDepartment(keyboard.nextLine());
        System.out.println("Enter the position of employee 1");
        Employee1.setPosition(keyboard.nextLine());
        System.out.println("Enter the date employee 1 was hired | MM/DD/YYYY");
        Employee1.setDateHired(keyboard.nextLine());

        System.out.println("Enter the name of employee 2");
        Employee2.setName(keyboard.nextLine());
        System.out.println("Enter the ID of employee 2");
        Employee2.setIdNumber(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the department of employee 2");
        Employee2.setDepartment(keyboard.nextLine());
        System.out.println("Enter the position of employee 2");
        Employee2.setPosition(keyboard.nextLine());
        System.out.println("Enter the date employee 2 was hired | MM/DD/YYYY");
        Employee2.setDateHired(keyboard.nextLine());

        System.out.println("Enter the name of employee 3");
        Employee3.setName(keyboard.nextLine());
        System.out.println("Enter the ID of employee 3");
        Employee3.setIdNumber(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the department of employee 3");
        Employee3.setDepartment(keyboard.nextLine());
        System.out.println("Enter the position of employee 3");
        Employee3.setPosition(keyboard.nextLine());
        System.out.println("Enter the date employee 3 was hired | MM/DD/YYYY");
        Employee3.setDateHired(keyboard.nextLine());


        // Displays all the information gathered above about the employees
        System.out.println("\n**Displaying info about employee 1**");
        System.out.println("Name of Employee: " + Employee1.getName());
        System.out.println("ID #: " + Employee1.getIdNumber());
        System.out.println("Department: " + Employee1.getDepartment());
        System.out.println("Position: " + Employee1.getPosition());
        System.out.println("Date Hired: " + Employee1.getDateHired());

        System.out.println("\n**Displaying info about employee 2**");
        System.out.println("Name of Employee: " + Employee2.getName());
        System.out.println("ID #: " + Employee2.getIdNumber());
        System.out.println("Department: " + Employee2.getDepartment());
        System.out.println("Position: " + Employee2.getPosition());
        System.out.println("Date Hired: " + Employee2.getDateHired());

        System.out.println("\n**Displaying info about employee 3**");
        System.out.println("Name of Employee: " + Employee3.getName());
        System.out.println("ID #: " + Employee3.getIdNumber());
        System.out.println("Department: " + Employee3.getDepartment());
        System.out.println("Position: " + Employee3.getPosition());
        System.out.println("Date Hired: " + Employee3.getDateHired());

        
        keyboard.close();
    }
}
