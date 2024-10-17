package employee;

public class Employee_Class {
		
	 private Node head;

	    // Method to add a new employee
	    public String addEmployee(int id, String name, double salary, String email) {
	        if (findEmployeeById(id) != null) {
	            return "Error: Employee ID must be unique.";
	        }

	        Node newEmployee = new Node(id, name, salary, email);
	        if (head == null) {
	            head = newEmployee;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newEmployee;
	        }
	        return "Employee added successfully!";
	    }

	    // Method to find an employee by ID
	    public String findEmployeeById(int id) {
	        Node current = head;
	        while (current != null) {
	            if (current.id == id) {
	                return "ID: " + current.id + ", Name: " + current.name + 
	                       ", Salary: " + current.salary + ", Email: " + current.email;
	            }
	            current = current.next;
	        }
	        return "Error: Employee not found.";
	    }

	    public String displayAllEmployees() {
	        if (head == null) {
	            return "No employees to display.";
	        }

	        StringBuilder employeeList = new StringBuilder();
	        Node current = head;
	        while (current != null) {
	            employeeList.append("ID: ").append(current.id);
	            employeeList.append(", Name: ").append(current.name);
	            employeeList.append(", Salary: ").append(current.salary);
	            employeeList.append(", Email: ").append(current.email);
	            employeeList.append("\n");
	            current = current.next;
	        }
	        return employeeList.toString();
	    }
	}

