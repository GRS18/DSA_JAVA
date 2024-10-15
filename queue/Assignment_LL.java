/*
in this there exists 2 queues in single array
one act from start to end
other end to start
user will be given option enqueue from 1,enqueue from 2,dequeue from 1,dequeue from 2nd,print queue 1,print queue2
start from mid to create queues
*/
package linkedlist;

import java.util.Scanner;

class TwoQueues {
	private int[] arr;
	private int maxSize;
	private int front1, rear1;
	private int front2, rear2;

	public TwoQueues(int size) {
		maxSize = size;
		arr = new int[maxSize];
		front1 = (maxSize / 2) - 1;
		rear1 = front1 + 1;
		front2 = maxSize / 2;
		rear2 = front2;
	}

	public void enqueue1(int value) {
		if (rear1 < maxSize / 2) {
			arr[rear1++] = value;
		} else {
			System.out.println("Queue 1 is full");
		}
	}

	public void enqueue2(int value) {
		if (rear2 < maxSize) {
			arr[rear2++] = value;
		} else {
			System.out.println("Queue 2 is full");
		}
	}

	public void dequeue1() {
		if (front1 < rear1) {
			System.out.println("Dequeued from Queue 1: " + arr[front1 + 1]);
			front1++;
		} else {
			System.out.println("Queue 1 is empty");
		}
	}

	public void dequeue2() {
		if (front2 > rear2) {
			System.out.println("Dequeued from Queue 2: " + arr[rear2 - 1]);
			rear2--;
		} else {
			System.out.println("Queue 2 is empty");
		}
	}

	public void printQueue1() {
		if (front1 < rear1) {
			System.out.print("Queue 1: ");
			for (int i = front1 + 1; i < rear1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("Queue 1 is empty");
		}
	}

	public void printQueue2() {
		if (front2 < rear2) {
			System.out.print("Queue 2: ");
			for (int i = rear2 - 1; i >= front2; i--) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("Queue 2 is empty");
		}
	}
}

public class Assignment_LL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the queues: ");
		int size = scanner.nextInt();

		TwoQueues queues = new TwoQueues(size);

		while (true) {
			System.out.println("Choose an operation: ");
			System.out.println("1. Enqueue to Queue 1");
			System.out.println("2. Enqueue to Queue 2");
			System.out.println("3. Dequeue from Queue 1");
			System.out.println("4. Dequeue from Queue 2");
			System.out.println("5. Print Queue 1");
			System.out.println("6. Print Queue 2");
			System.out.println("0. Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to enqueue to Queue 1: ");
				int value1 = scanner.nextInt();
				queues.enqueue1(value1);
				break;
			case 2:
				System.out.print("Enter value to enqueue to Queue 2: ");
				int value2 = scanner.nextInt();
				queues.enqueue2(value2);
				break;
			case 3:
				queues.dequeue1();
				break;
			case 4:
				queues.dequeue2();
				break;
			case 5:
				queues.printQueue1();
				break;
			case 6:
				queues.printQueue2();
				break;
			case 0:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
