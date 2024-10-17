package employee;

public class Node {

		int id;
		String name;
	    double salary;
	    String email;
	    Node next;

	    public Node(int id, String name, double salary, String email) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.email = email;
	        this.next = null;
	    }
	
}
