/* Write a program which accept the string and reverse each word of the string using Static implementation of stack.
Example: Input - This is an input string
  Output - sihTsinatupnignirts.*/
package assignment21;

import java.util.Scanner;

public class StackReverse {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		Stack obj = new Stack();

		System.out.println("Enter word");
		String word = in.nextLine();

		obj.create_Stack(word.length());

		for (int i = 0; i < word.length(); i++)
			obj.push(word.charAt(i));

		String r_word = "";

		while (obj.is_Empty() != true)
			r_word += obj.pop();

		System.out.println("Reverse is:" + r_word);
	}

}
