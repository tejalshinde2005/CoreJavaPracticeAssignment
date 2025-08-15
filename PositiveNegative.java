//Question 1: Write a Java program that takes an integer as input from the user. If the number is positive, print a message "The number is positive."
//Example Input:
//15
//Example Output:
//The number is positive.
package Package;
import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");
int num = sc.nextInt();

if(num > 0) {
	System.out.println("number is positive");
}
else {
	System.out.println("number is negative");
		}
	}

}