/*_________________________________
Question 2: Create a Java program that asks the user to enter their age.
 Based on the age, determine if they are eligible to vote. A person is 
 eligible to vote if their age is 18 or greater. Print "You are eligible 
 to vote." or "You are not eligible to vote yet." accordingly.

Example Input 1:
22
Example Output 1:
You are eligible to vote.
Example Input 2:
16
Example Output 2:
You are not eligible to vote yet*/

package Package;

import java.util.Scanner;

public class EligibalOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        
        System.out.println("Your age is  = "+ age);
        
        if(age >=18) {
        	System.out.println(" congrutulations....! you are eligible to vote.");
        }
        else {
        	System.out.println(" Sorry....! you are not eligible to vote yet.");
        }
        
	}

}
