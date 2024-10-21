/* Write a menu driven program for singly linked list-
-	To create linked list.
-	To display linked list
-	To search node in linked list.
-	Insert at last position
*/

package assignment21;

import java.util.Scanner;

public class Singly_LL {
	
	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = next;
		}

	}
	
	Node root;
	void create_list()
	{
		root = null;
	}
	
	void insert_Last(int data) {
		Node n = new Node(data);
		if (root == null)
			root = n;
		else
		{
			Node t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
		System.out.println(root.data + " inserted");
	}
	
	void display_list() {
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
	
	void search_list(int data) {
		Node t = root;
		if (root == null)
			System.out.println("List Empty");
		else {
			while (t != null) {
				if (t.data == data)
				{
					System.out.println(t.data + " found in list");
					break;
				}
				t = t.next;
			}
			if (t == null)
				System.out.println(data + " not found in list");
		}
	}
	
	public static void main(String[] args) {

		Singly_LL obj = new Singly_LL();
		Scanner in = new Scanner(System.in);
		int ch, key, e;
		System.out.println("---------------Linked List------------------------");
		do {
			System.out.println("\n1.Insert Last\n2.Display list\n3.Search List\n0.Exit :");
		
			ch = in.nextInt();
			
			switch (ch) {
			
			case 1:
				int n;
				System.out.println("Enter elements in left :");
				n = in.nextInt();
				obj.insert_Last(n);
				break;

			case 2:
				obj.display_list();
				break;

			case 3:
				int nos;
				System.out.println("Enter elements to Search:");
				nos = in.nextInt();
				obj.search_list(nos);
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
