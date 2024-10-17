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


/*// Java program for the above approach
import java.util.*;

class GFG {

	// Linked list node
	static class Node {
		int data;
		Node next;
	};
	static Node head1, head2;

	// Utility function to append key at
	// end of linked list
	static Node insertNode(Node head, int x)
	{
		Node ptr = new Node();
		ptr.data = x;
		ptr.next = null;
		if (head == null) {
			head = ptr;
		}
		else {
			Node temp;
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = ptr;
		}

		return head;
	}

	// Utility function to print linkedlist
	static void display(Node head)
	{
		Node temp;
		temp = head;
		if (temp == null) {
			System.out.print("null \n");
		}
		else {
			while (temp != null) {
				System.out.print(temp.data);
				if (temp.next != null)
					System.out.print("->");
				temp = temp.next;
			}
		}
	}

	// Function to merge two linked lists
	static Node MergeLinkedlist()
	{
		Node ptr;
		ptr = head1;
		while (ptr.next != null) {
			ptr = ptr.next;
		}

		// Join linked list by placing address of
		// first node of L2 in the last node of L1
		ptr.next = head2;

		return head1;
	}

	// Function to merge two unsorted linked
	// lists to get a sorted list
	static void sortLinkedList()
	{
		// Function call to merge the two lists
		Node head = MergeLinkedlist();

		// Declare a vector
		Vector<Integer> V = new Vector<>();
		Node ptr = head;

		// Push all elements into vector
		while (ptr != null) {
			V.add(ptr.data);
			ptr = ptr.next;
		}
		Collections.sort(V);
		// Sort the vector
		;
		int index = 0;
		ptr = head;

		// Insert elements in the linked
		// list from the vector
		while (ptr != null) {
			ptr.data = V.get(index);
			index++;
			ptr = ptr.next;
		}

		// Display the sorted and
		// merged linked list
		display(head);
	}

	// Driver Code
	public static void main(String[] args)
	{
		// Given linked list, L1

		head1 = insertNode(head1, 3);
		head1 = insertNode(head1, 5);
		head1 = insertNode(head1, 1);

		// Given linked list, L2
		head2 = null;
		head2 = insertNode(head2, 6);
		head2 = insertNode(head2, 2);
		head2 = insertNode(head2, 4);
		head2 = insertNode(head2, 9);

		// Function Call
		sortLinkedList();
	}
}

// This code is contributed by umadevi9616
*/