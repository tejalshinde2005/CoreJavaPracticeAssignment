/*Question 3:Write a Java program that takes a student's percentage score as 
input (an integer between 0 and 100). Based on the score, assign a grade 
using the following criteria:
90-100: Grade A
80-89: Grade B
70-79: Grade C
60-69: Grade D
Below 60: Grade F
Print the corresponding grade.
Example Input 1:
85
Example Output 1:
Grade B
Example Input 2:
55
Example Output 2:
Grade F*/
package Package;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your percentage");
		float num = sc.nextFloat();
		
		if(num>=90 && num<=100) {
			System.out.println("Grade A");
		}
		else if (num>=80 && num<=89) {
			System.out.println("Grade B");
		}
		
		else if (num>=70 && num<=79) {
			System.out.println("Grade C");
		}
		
		else if (num>=60 && num<=69) {
			System.out.println("Grade D");
		}
		
		else if (num<60) {
			System.out.println("Failed");
		}

	}

}
