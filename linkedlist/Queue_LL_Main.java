////Queue using Linked List(Dynamic Queue) - main fun.
package linkedlist;

import java.util.Scanner;

import queue.Queue_Class;

public class Queue_LL_Main {

	public static void main(String[] args) {

		Queue_LL obj = new Queue_LL();
		Scanner in = new Scanner(System.in);
		int ch;
		obj.create_Queue();
		do {
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print:\n0.Exit :");
			ch = in.nextInt();
			switch (ch) {
			case 1:

				System.out.println("Enter element:");
				int e = in.nextInt();
				obj.Enqueue(e);
				;
				break;

			case 2:
				obj.Dequeue();
				break;

			case 3:
				obj.print_queue();
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
