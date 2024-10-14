/*Assignment - A data structure that follows the Last-In-First-Out (LIFO) principle, meaning the last element added is the first one to be removed.  
Efficiently manage two stacks within a single array, ensuring optimal space utilization and avoiding overflows.
Provide a user-friendly interface with options to perform various operations on the stacks, such as pushing, popping, peeking, checking emptiness, and displaying elements.
Example
  Enter the capacity of the array: 5 
 Menu:
1. Push to Stack 1 
2. Pop from Stack 1 
3. Peek at Stack 1 
4. Check if Stack 1 is empty 
5. Push to Stack 2 
6. Pop from Stack 2 
7. Peek at Stack 2 
8. Check if Stack 2 is empty 
9. Exit */ 
package stackdsa;

import java.util.Scanner;

class Doubles {
	private int capacity;
	private int[] array;
	private int top1, top2;

	public Doubles(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.top1 = -1;
		this.top2 = capacity;
	}

	// Stack 1
	public void pushStack1(int value) {
		if (top1 + 1 < top2) {
			array[++top1] = value;
		} else {
			System.out.println("Stack 1 Overflow!");
		}
	}

	public Integer popStack1() {
		if (top1 >= 0) {
			return array[top1--];
		} else {
			System.out.println("Stack 1 Underflow!");
			return null;
		}
	}

	public Integer peekStack1() {
		if (top1 >= 0) {
			return array[top1];
		} else {
			System.out.println("Stack 1 is empty!");
			return null;
		}
	}

	public boolean isEmptyStack1() {
		return top1 == -1;
	}

	// Stack 2
	public void pushStack2(int value) {
		if (top2 - 1 > top1) {
			array[--top2] = value;
		} else {
			System.out.println("Stack 2 Overflow!");
		}
	}

	public Integer popStack2() {
		if (top2 < capacity) {
			return array[top2++];
		} else {
			System.out.println("Stack 2 Underflow!");
			return null;
		}
	}

	public Integer peekStack2() {
		if (top2 < capacity) {
			return array[top2];
		} else {
			System.out.println("Stack 2 is empty!");
			return null;
		}
	}

	public boolean isEmptyStack2() {
		return top2 == capacity;
	}
}

public class DoubleStack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the capacity of the array: ");
		int capacity = scanner.nextInt();
		Doubles Double = new Doubles(capacity);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Push to Stack 1");
			System.out.println("2. Pop from Stack 1");
			System.out.println("3. Peek at Stack 1");
			System.out.println("4. Check if Stack 1 is empty");
			System.out.println("5. Push to Stack 2");
			System.out.println("6. Pop from Stack 2");
			System.out.println("7. Peek at Stack 2");
			System.out.println("8. Check if Stack 2 is empty");
			System.out.println("9. Exit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to push to Stack 1: ");
				Double.pushStack1(scanner.nextInt());
				break;
			case 2:
				System.out.println("Popped from Stack 1: " + Double.popStack1());
				break;
			case 3:
				System.out.println("Peek at Stack 1: " + Double.peekStack1());
				break;
			case 4:
				System.out.println("Stack 1 is empty: " + Double.isEmptyStack1());
				break;
			case 5:
				System.out.print("Enter value to push to Stack 2: ");
				Double.pushStack2(scanner.nextInt());
				break;
			case 6:
				System.out.println("Popped from Stack 2: " + Double.popStack2());
				break;
			case 7:
				System.out.println("Peek at Stack 2: " + Double.peekStack2());
				break;
			case 8:
				System.out.println("Stack 2 is empty: " + Double.isEmptyStack2());
				break;
			case 9:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
