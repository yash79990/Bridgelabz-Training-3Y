package inbuiltsfunction;

public class Employee {
    private static String companyName;
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee.setCompanyName("Tech Solutions");
        Employee e1 = new Employee("Thamarai", 101, "Developer");
        Employee e2 = new Employee("Rohan", 102, "Manager");

        Employee.displayTotalEmployees();
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
    }
}