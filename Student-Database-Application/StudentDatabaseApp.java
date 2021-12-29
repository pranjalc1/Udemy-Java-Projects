import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many users we want to add
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int numOfStudents = 0;

        if (sc.hasNextInt())
        {
            numOfStudents = sc.nextInt();
        }

        // Create n number of new students
        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++)
        {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i]);
        }
    }
}
