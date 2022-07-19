import java.util.Scanner;


public class Email {
private String firstName;
private String lastName;
private String password;
private String department;
private int mailboxCapacity = 500;
private String email;
private int defaultPasswordLength = 10;
private String alternateEmail;
private String companySuffix = "company";

// Constructor to recieve the first name, last name.
public Email(String firstName, String lastName) {
  this.firstName = firstName;
  this.lastName = lastName;
  System.out.println("Email created for " + firstName + " " + lastName);

  // Call a method asking for department - return the department.
  this.department = setDepartment();
  System.out.println("Department set to " + this.department);

  // Call a method that returns a random password.
  this.password = randomPassword(defaultPasswordLength);
  System.out.println("Password set to " + this.password);

  //combine the first and last name to create the email.
  email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.companySuffix + ".com";
  System.out.println("Email set to " + email);
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
private String randomPassword(int length) {
  String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
  char[] password = new char[length];
  for (int i = 0; i < length; i++) {
    int rand = (int) (Math.random() * passwordSet.length());
    password[i] = passwordSet.charAt(rand);
  }
  return new String(password);
}
// Set mailbox capacity
public void setMailboxCapacity(int capacity) {
  this.mailboxCapacity = capacity;
}
// Set the alternate email address
public void setAlternateEmail(String altEmail) {
  this.alternateEmail = altEmail;
}

// Change the password
public void changePassword(String newPassword) {
  this.password = newPassword;
}

public int getMailboxCapacity() { return mailboxCapacity; }
public String getAlternateEmail() { return alternateEmail; }
public String getPassword() { return password; }

}
