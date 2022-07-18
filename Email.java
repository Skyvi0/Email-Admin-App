import java.util.Scanner;


public class Email {
private String firstName;
private String lastName;
private String password;
private String department;
private int mailboxCapacity;
private String alternateEmail;

// Constructor to recieve the first name, last name.
public Email(String firstName, String lastName) {
  this.firstName = firstName;
  this.lastName = lastName;
  System.out.println("Email created for " + firstName + " " + lastName);

  // Call a method asking for department - return the department.
  this.department = setDepartment();
  System.out.println("Department set to " + this.department);

}




// Ask for the department.
private String setDepartment() {
  System.out.print("What department are you in?\n1 for IT\n2 for Sales\n3 for Accounting\n4 for Marketing\n5 for Human Resources\n");
  Scanner in = new Scanner(System.in);
  int depChoice = in.nextInt();
  if (depChoice == 1) { return "IT"; }
  else if (depChoice == 2) { return "Sales"; }
  else if (depChoice == 3) { return "Accounting"; }
  else if (depChoice == 4) { return "Marketing"; }
  else if (depChoice == 5) { return "Human Resources"; }
  else { return "Invalid"; }
}
// Generate a random password

// Set mailbox capacity

// Set the alternate email address

// Change the password

}
