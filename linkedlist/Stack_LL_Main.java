package linkedlist;

import java.util.Scanner;

public class Stack_LL_Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Stack_LL obj = new Stack_LL();// object created
		obj.create_stack();
		int ch, e;
		do {
			System.out.println("Stack Menu");
			System.out.println("-----------");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Print all elements");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element:");
				e = in.nextInt();
				obj.push(e);
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.peek();
				break;
			case 4:
				obj.print_stack();
				break;
			case 0:
				System.out.println("Thanks for using code , coded by ");
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;
			}

		} while (ch != 0);
	}

}
