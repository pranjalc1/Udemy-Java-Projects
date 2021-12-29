import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student
{
    private String               firstName;
    private String               lastName;
    private int                  gradeYear;
    private int                  studentID;
    public static final String[] COURSE_LIST  = { "History 101", "Math 101", "English 101",
        "Chemistry 101", "Computer Science 101" };
    private ArrayList<String>    courses      = new ArrayList<String>();
    private double               tuitionBalance;
    private static final double  costOfCourse = 600;
    public static int            id           = 1000;

    // Constructor to recieve student's name and year
    public Student()
    {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // prompt for first name
        System.out.print("Enter student's first name: ");
        firstName = sc.nextLine();
        while (firstName.equals(""))
        {
            System.out.print("Enter student's first name: ");
            firstName = sc.nextLine();
        }

        // prompt for last name
        System.out.print("Enter student's last name: ");
        lastName = sc.nextLine();
        while (lastName.equals(""))
        {
            System.out.print("Enter student's last name: ");
            lastName = sc.nextLine();
        }

        // prompt for lastname
        System.out
            .print("\nStudent's grade\nFRESHMAN=1\nSOPHOMORE=2\nJUNIOR=3\nSENIOR=4\nEnter here: ");
        gradeYear = 0;
        if (sc.hasNextInt())
        {
            gradeYear = sc.nextInt();
            if (gradeYear < 1 || gradeYear > 4)
            {
                gradeYear = 0;
            }
        }

        generateStudentID();

        System.out.println();
    }


    // Generate an ID number
    private void generateStudentID()
    {
        id++;
        String stringID = "" + gradeYear + "" + id;
        studentID = Integer.parseInt(stringID);
    }


    // Enroll in courses
    public void enroll()
    {
        System.out.println("Course enrollment\nAvailable courses:");
        System.out.println(
            "History 101\nMath 101\nEnglish 101\nChemistry 101\nComputer Science 101");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course to enroll in (q to quit): ");
        String course = sc.nextLine();

        while (!course.equalsIgnoreCase("q") || course.equals(""))
        {
            if (Arrays.asList(COURSE_LIST).contains(course) && !courses.contains(course))
            {
                courses.add(course);
                tuitionBalance += costOfCourse;
            }
            System.out.print("Enter course to enroll in (q to quit): ");
            course = sc.nextLine();
        }

        System.out.println("\nENROLLED IN: \n" + displayCourses());

        System.out.println();
    }


    // View balance
    public void viewBalance()
    {
        System.out.println("Your balance is: $" + tuitionBalance);
    }


    // Pay tuition
    public void payTuition()
    {
        viewBalance();
        Scanner sc = new Scanner(System.in);
        double payment = 0;
        System.out.print("Enter your payment: $");
        while (!sc.hasNextDouble()) {}
        payment = sc.nextDouble();

        if (payment > tuitionBalance)
        {
            System.out.println("Thank you for your payment of " + tuitionBalance);
            System.out.println("Your change is " + (payment - tuitionBalance));
            tuitionBalance = 0;
        }
        else
        {
            tuitionBalance -= payment;
            System.out.println("Thank you for your payment of " + payment);
        }

        viewBalance();
    }

    // Show status
    public String showInfo()
    {
        String info = "---------------------------------";
        info += "\nName: " + firstName + " " + lastName
                        + "\nGrade Level: " + gradeYear
                        + "\nStudent ID: " + studentID
                        + "\nCourses: \n" + displayCourses()
                        + "Balance: $" + tuitionBalance;
        info += "\n---------------------------------";
        return info;
    }

    public String toString()
    {
        return showInfo();
    }


    // Helper methods
    private String displayCourses()
    {
        String courseString = "";
        for (String course : courses)
        {
            courseString += course + "\n";
        }
        return courseString;
    }
}
