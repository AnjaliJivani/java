class Member {
    // Data members
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Method to print the salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    // Data member
    String specialization;

    // Constructor to initialize Employee details
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }

    // Method to display Employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    // Data member
    String department;

    // Constructor to initialize Manager details
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    // Method to display Manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}

public class Lab_6_3 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 30, "123-456-7890", "123 Elm St", 50000.0, "Software Engineering");

        // Creating a Manager object
        Manager manager = new Manager("Jane Smith", 40, "098-765-4321", "456 Oak St", 75000.0, "IT Department");

        // Displaying details of Employee and Manager
        employee.displayEmployeeDetails();
        System.out.println();
        manager.displayManagerDetails();
    }
}
