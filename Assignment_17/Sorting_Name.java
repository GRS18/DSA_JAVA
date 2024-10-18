/*Write a program to accept names from the user and sort in alphabetical order using bubble sort 
-	Accept n name									
-	Bubble sort Function							
-	Display	
*/

package Assignment_2;

import java.util.Scanner;

public class Sorting_Name {

	static void Sort(String[] names) {
		int n = names.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (names[j].compareTo(names[j + 1]) > 0) {

					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of names: ");
		int n = scanner.nextInt();

		String[] names = new String[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Enter name " + (i + 1) + ": ");

			names[i] = scanner.next();
		}

		Sort(names);

		System.out.println("\nNames in alphabetical order:");

		for (String name : names) {

			System.out.println(name);
		}
	}
}
