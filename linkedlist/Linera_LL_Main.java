package linkedlist;

import java.util.Scanner;

public class Linera_LL_Main {

	public static void main(String[] args) {

		Linear_LL obj = new Linear_LL();
		Scanner in = new Scanner(System.in);
		int ch, key, e;
		System.out.println("---------------Linked List------------------------");
		do {
			System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print list"
					+ "\n6.Search List\n7.Delete particular element\n8.Insert aftert\n9.Insert before\n0.Exit :");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				int n;
				System.out.println("Enter elements in left :");
				n = in.nextInt();
				obj.insert_left(n);
				break;

			case 2:
				int no;
				System.out.println("Enter elements in right:");
				no = in.nextInt();
				obj.insert_left(no);
				break;

			case 3:
				obj.delete_left();
				break;

			case 4:
				obj.delete_right();
				break;

			case 5:
				obj.print_list();
				;
				break;

			case 6:
				int nos;
				System.out.println("Enter elements to Search:");
				nos = in.nextInt();
				obj.search_list(nos);
				break;

			case 7:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.delete_element(e);
				break;
			case 8:
				System.out.println("Enter element to insert after:");
				e = in.nextInt();
				System.out.println("Enter element to search:");
				key = in.nextInt();
				obj.insert_after(key, e);
				System.out.println("Element Inserted");
				break;

			case 9:
				System.out.println("Enter element to insert before:");
				e = in.nextInt();
				System.out.println("Enter element to search:");
				key = in.nextInt();
				obj.insert_before(key, e);
				System.out.println("Element Inserted");
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
