import java.util.*;

public class Email
{
    private String firstName;
    private String lastName;
    private String department;
    private String companySuffix         = "javacorp.com";
    private String password;
    private int    defaultPasswordLength = 15;
    private int    mailboxCapacity       = 500;
    private String email;
    private String altEmail;

    // Constructor to receive first and last name
    public Email(String first, String last)
    {
        firstName = first;
        lastName = last;
        System.out.println("EMAIL CREATED: " + firstName + " " + lastName);

        System.out.println();

        // Call method to set department
        department = setDepartment();
        System.out.println("Department: " + department);

        System.out.println();

        // Call method to return random password
        password = generatePassword(defaultPasswordLength);
        System.out.println("Your password is: " + password);

        System.out.println();

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@";
        if (!department.equals(""))
        {
            email += department + ".";
        }
        email += companySuffix;
        System.out.println("Your email is: " + email);
    }


    // Ask for the department
    public String setDepartment()
    {
        System.out.println("Enter the department");

        Scanner sc;
        String dep = "";

        do
        {
            System.out.print(
                "DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
            sc = new Scanner(System.in);
            if (sc.hasNext())
            {
                dep = sc.next();
            }
            sc.close();
        }
        while (!dep.equals("1") && !dep.equals("2") && !dep.equals("3") && !dep.equals("0"));

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
    public String generatePassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";

        Random random = new Random();
        String randomPassword = "";

        for (int i = 0; i < length; i++)
        {
            int next = random.nextInt(passwordSet.length());
            randomPassword = randomPassword + passwordSet.charAt(next);
        }

        return randomPassword;
    }


    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        mailboxCapacity = capacity;
        System.out.println();
        System.out.println("Your mailbox capacity is: " + mailboxCapacity);
    }


    // Set the alternate email
    public void setAlternateEmail(String alternate)
    {
        altEmail = alternate;
        System.out.println();
        System.out.println("Your alternate email is : " + altEmail);
    }


    // Change the password
    public void changePassword(String newPassword)
    {
        password = newPassword;
        System.out.println();
        System.out.println("Your new password is : " + password);
    }


    // Get name
    public String getName()
    {
        return firstName + " " + lastName;
    }


    // Get email
    public String getEmail()
    {
        return email;
    }


    // Get alternate email
    public String getAlternateEmail()
    {
        return altEmail;
    }


    // Get mailbox capacity
    public int getMailboxCapacity()
    {
        return mailboxCapacity;
    }


    // Show info about email
    public String showInfo()
    {
        System.out.println("\n------------------------------------------");
        String info = "DISPLAY NAME: " + getName();
        info += "\n" + "COMPANY EMAIL: " + getEmail();
        info += "\n" + "MAILBOX CAPACITY: " + mailboxCapacity + " emails";
        System.out.println(info + "\n------------------------------------------");
        return info;
    }
}
