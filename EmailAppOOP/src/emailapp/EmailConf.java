package emailapp;

import java.util.Scanner;

public class EmailConf {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "MVT-Utany.com";

    //Constructor  to receive the first name and last name
    public EmailConf(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the department -> returns the department
        this.department = setDepartment();

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is -> " +  this.password );

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
    }

    //Ask for the department
    private String setDepartment() {
        System.out.print("New worker: " + firstName + ". Enter Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department Code: ");
        Scanner scannerIn = new Scanner(System.in);
        int departmentChoice = scannerIn.nextInt();

        if (departmentChoice == 1){ return "Sales"; }
        else if (departmentChoice == 2) { return "Development"; }
        else if (departmentChoice == 3) { return "Accounting"; }
        else {return "";}

    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ01234567890!@#$%";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int randValuesNumbers = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randValuesNumbers);
        }

        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    //Getters
    public int getMailBoxCapacity() { return mailBoxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox capacity: " + mailBoxCapacity + "mb";
    }

}
