/*)Write a program to create two singly linked list of elements of type integer and find the union of the linked lists. 
 * (Accept elements in the sorted order.)*/
package Assignment_17;

import java.util.Scanner;

public class Union_LL {

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

		Union_LL obj = new Union_LL();
		Union_LL obj2 = new Union_LL();
		Union_LL obj3 = new Union_LL();

		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter elements Linked List 1:");
		n = in.nextInt();
		obj.insert(n);

		System.out.println("Enter elements Linked List 2:");
		n = in.nextInt();
		obj2.insert(n);

		System.out.println("Data is : ");
		obj.print_list();
		obj2.print_list();

	}

}
