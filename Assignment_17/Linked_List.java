/*Write a program to create linked list with given number in which data part of each node contains individual digit of the number.
(Ex. Suppose the number is 368 then the nodes of linked list should contain 3, 6, 8)
*/
package Assignment_17;

import java.util.Scanner;

public class Linked_List {

	Node root;

	void create_list() {
		root = null;
	}

	void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
		} else {
			n.next = root;
			root = n;
		}
	}

	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Node t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	public static void main(String[] args) {

		Linked_List obj = new Linked_List();
		Scanner in = new Scanner(System.in);
		int n;

		System.out.println("Enter elements:");
		n = in.nextInt();
		while (n != 0) {
			int k = n % 10;
			obj.insert(k);
			n = n / 10;
		}

		System.out.println("Data is : ");
			obj.print_list();

	}

}
