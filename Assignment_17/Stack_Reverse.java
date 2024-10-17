// Write a  program to accept a string from user and reverse it using Static implementation of Stack.
package Assignment_17;

import java.util.Scanner;

public class Stack_Reverse {
	
	public static void main(String args[]) {
		
        Scanner in = new Scanner(System.in);
        
        Stack obj = new Stack();
        
        System.out.println("Enter word");
        String word=in.next();
        
        obj.create_Stack(word.length());
        
        for(int i=0;i<word.length();i++)
            obj.push(word.charAt(i));
        
        String r_word="";
        
        while(obj.is_Empty()!=true)
            r_word+=obj.pop();

        System.out.println("Reverse is:"+r_word);
    }
	

}
