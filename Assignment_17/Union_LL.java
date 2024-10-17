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

		Scanner in = new Scanner(System.in);

		int n, ch;
		do {
			System.out.println("\n1.Insert\n2.Print list\n0.Exit :");
			System.out.println("Enter your Choise");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element in Linked List 1:");
				n = in.nextInt();
				obj.insert(n);

				System.out.println("Enter element in Linked List 2:");
				n = in.nextInt();
				obj2.insert(n);
				break;
			case 2:
				System.out.println("Union of Sorted LinkList is : ");
				obj.print_list();
				obj2.print_list();
				break;
			case 0:
				System.out.println("Exiting thank for using code");
				break;
			default:
				System.out.println("Wrong option selected");
				break;

			}

		} while (ch != 0);
	}

}

