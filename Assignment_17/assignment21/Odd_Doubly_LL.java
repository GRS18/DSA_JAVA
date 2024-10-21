/*Write a  program to create doubly link list and display nodes having odd value.*/
package assignment21;

import java.util.Scanner;

public class Odd_Doubly_LL {

	class Dnode {
		int data;
		Dnode left, right;

		public Dnode(int data) {

			this.data = data;
			left = right = null;
		}

	}

	Dnode root;

	void create_list() {
		root = null;
	}

	void insert(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;
		} else {
			n.right = root;
			root.left = n;
			root = n;
		}
		System.out.println(data + " inserted");

	}

	void display_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Dnode t = root;
			while (t != null) {
				if (t.data % 2 != 0) {
					System.out.print("<-|" + t.data + "|->");
				}
				t = t.right;
			}
		}
	}

	public static void main(String[] args) {
		Odd_Doubly_LL obj = new Odd_Doubly_LL();
		Scanner in = new Scanner(System.in);
		int ch, e, key;

		do {
			System.out.println("\n1.Insert\n2.Print\n0.Exit :");
			ch = in.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert(e);
				System.out.println("Element Inserted");
				break;

			case 2:
				obj.display_list();
				break;

			case 0:
				System.out.println("Exiting....");
				break;

			default:
				System.out.println("Wrong option selected");
				break;

			}

		} while (ch != 0);
	}

}
