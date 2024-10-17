package graph;

import java.util.Scanner;

//public class Celibrity_Problem {
	
/*	class EmployeeNode {
	    int id;
	    String name;
	    double salary;
	    String email;
	    EmployeeNode next;

	    public EmployeeNode(int id, String name, double salary, String email) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.email = email;
	        this.next = null;
	    }
	}

	
	class EmployeeManagementSystem {
	    private EmployeeNode head;

	    // Method to add a new employee
	    public String addEmployee(int id, String name, double salary, String email) {
	        if (findEmployeeById(id) != null) {
	            return "Error: Employee ID must be unique.";
	        }

	        EmployeeNode newEmployee = new EmployeeNode(id, name, salary, email);
	        if (head == null) {
	            head = newEmployee;
	        } else {
	            EmployeeNode current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newEmployee;
	        }
	        return "Employee added successfully!";
	    }

	    // Method to find an employee by ID
	    public String findEmployeeById(int id) {
	        EmployeeNode current = head;
	        while (current != null) {
	            if (current.id == id) {
	                return "ID: " + current.id + ", Name: " + current.name + 
	                       ", Salary: " + current.salary + ", Email: " + current.email;
	            }
	            current = current.next;
	        }
	        return "Error: Employee not found.";
	    }

	    // Method to display all employees
	    public String displayAllEmployees() {
	        if (head == null) {
	            return "No employees to display.";
	        }

	        StringBuilder employeeList = new StringBuilder();
	        EmployeeNode current = head;
	        while (current != null) {
	            employeeList.append("ID: ").append(current.id)
	                         .append(", Name: ").append(current.name)
	                         .append(", Salary: ").append(current.salary)
	                         .append(", Email: ").append(current.email)
	                         .append("\n");
	            current = current.next;
	        }
	        return employeeList.toString();
	    }
	}


	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        EmployeeManagementSystem ems = new EmployeeManagementSystem();

	        while (true) {
	            System.out.println("1. Add Employee");
	            System.out.println("2. Find Employee by ID");
	            System.out.println("3. Display All Employees");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); // consume newline
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Salary: ");
	                    double salary = scanner.nextDouble();
	                    scanner.nextLine(); // consume newline
	                    System.out.print("Enter Email: ");
	                    String email = scanner.nextLine();
	                    System.out.println(ems.addEmployee(id, name, salary, email));
	                    break;
	                case 2:
	                    System.out.print("Enter Employee ID to search: ");
	                    int searchId = scanner.nextInt();
	                    System.out.println(ems.findEmployeeById(searchId));
	                    break;
	                case 3:
	                    System.out.println("Employee List:\n" + ems.displayAllEmployees());
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
	}
*/