/* Write a  program to accept the names of cities and store them in array.
Accept the city name from user and use linear search algorithm to check whether the city is present in array or not.	
*/
package assignment21;

import java.util.Scanner;

public class Sort_Cities {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int n = sc.nextInt();

		String a[] = new String[n];

		System.out.println("Enter city name : ");
		for (int i = 0; i < n; i++) {

			a[i] = sc.next();
		}

		System.out.println("Enter City Name you want to search");
		String name = sc.next();

		int ans = 1;

		for (int i = 0; i < n; i++) {

			if (a[i] == name) {

				ans = 1;

			}

		}
		if (ans == 1) {

			System.out.println(name + " found in our array ");

		} else {

			System.out.println(name + " not found");
		}
	}
}
