//CODE BY: GAVEN FRANCO
//DATE: 02/27/24
//DESCRIPTION: THIS CODE DEFINES THE CLASS EMPLOYEE WITH DIFFERENT FIELDS LIKE NAME ID DEP POSTI AND DATE HIRED AS WELL AS CONSTRUCTORS AND METHODS TO SET AND RETRIVE THOSE VALUES


public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    private String dateHired;

    // Constructors
    public Employee(String name, int idNumber, String department, String position, String dateHired) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
        this.dateHired = dateHired;
    }
    public Employee(String name, int idNumber, String dateHired) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
        this.dateHired = dateHired;
    }
    public Employee(int idNumber, String name, String dateHired, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
        this.dateHired = dateHired;
    }
    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
        this.dateHired = "";
    }
   
    // Sets up the getter and setter methods to for things like name, id number, dempartment, and date hired
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDateHired() {
        return dateHired;
    }
    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
}