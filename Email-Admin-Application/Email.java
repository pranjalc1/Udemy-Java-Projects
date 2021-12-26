import java.util.*;
import javax.print.attribute.SupportedValuesAttribute;

public class Email
{
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String password;
    private int    mailboxCapacity;
    private String altEmail;

    // Constructor to receive first and last name
    public Email(String first, String last)
    {
        firstName = first;
        lastName = last;
        System.out.println("EMAIL CREATED: " + firstName + " " + lastName);

        System.out.println();

        // Call method to ask for department
        department = setDepartment();
        System.out.println("Department: " + department);
    }

    // Ask for the department
    public String setDepartment()
    {
        System.out.println("Enter the department");
        
        Scanner sc;
        String dep;

        do
        {
            System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
            sc = new Scanner(System.in);
            dep = sc.next();
            sc.close();
        } while (!dep.equals("1") && !dep.equals("2") && !dep.equals("3") && !dep.equals("0"));

        int depInput = Integer.parseInt(dep);
        switch (depInput)
        {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acct";
            default:
                return "";

        }
    }

    // Generate a random password
    public String generatePassword()
    {
        return null;
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int newMailCap)
    {
        mailboxCapacity = newMailCap;
    }

    // Set the alternate email
    public void setAlternateEmail()
    {

    }

    // Change the password
    public void setPassword(String newPassword)
    {
        password = newPassword;
    }

    // Get name
    public String getName()
    {
        return firstName + " " + lastName;
    }

    // Get email
    public String getEmail()
    {
        return firstName + "." + lastName + "@" + department + "." + company + ".com";
    }

    // Get mailbox capacity
    public int getMailboxCapacity()
    {
        return mailboxCapacity;
    }
}
