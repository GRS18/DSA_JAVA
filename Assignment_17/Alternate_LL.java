/*Write a  program to create a singly Link list and display lits alternative nodes.
(start displaying from first node)	
*/
package Assignment_2;

import java.util.Scanner;

public class Alternate_LL {

	Node root;

	void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
		} else {
			n.next = root;
			root = n;
		}
		System.out.println(root.data + " inserted");

	}

	void print() {
		if (root == null) {
			System.out.println("List is empty");
			return;
		}

		Node current = root;
		System.out.print("|" + current.data + "|->");
		boolean alt = true;

		while (current != null) {
			if (alt) {
				System.out.print("|" + current.data + "|->");
			}
			current = current.next;
			alt = !alt;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Alternate_LL list = new Alternate_LL();
		Scanner scanner = new Scanner(System.in);
		int choice, data;

		do {
			System.out.println("\n1. Insert Element in LL\n2. Display alt Nodes\n0. Exit");
			System.out.print("Enter Choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter element: ");
				data = scanner.nextInt();
				list.insert(data);
				break;
			case 2:
				System.out.println("alternate Nodes are: ");
				list.print();
				break;
			case 0:
				System.out.println("Thank you!");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		} while (choice != 0);

	}
}
