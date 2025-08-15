/* Question 4:Create a Java program that simulates a simple login system.
  Ask the user to enter a username and a password.

If the username is "admin" AND the password is "password123", print "Login Successful!".
If the username is correct but the password is wrong, print "Incorrect Password.".
If the username is incorrect, print "Incorrect Username.".

Example Input 1:
Username: admin
Password: password123

Example Output 1:
Login Successful!

Example Input 2:
Username: admin
Password: wrongpass

Example Output 2:
Incorrect Password.

Example Input 3:
Username: user
Password: password123

Example Output 3:
Incorrect Username.*/
package Package;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Correct credentials
        String correctUsername = "admin";
        String correctPassword = "password123";

        // User input
        System.out.println("Enter Your Username:");
        String inputUsername = sc.next();

        System.out.println("Enter Your Password:");
        String inputPassword = sc.next();

        // Logic to check login
        if (inputUsername.equals(correctUsername)) {
            if (inputPassword.equals(correctPassword)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Incorrect Password.");
            }
        } else {
            System.out.println("Incorrect Username.");
        }

        // Close scanner
        sc.close();
    }
}
