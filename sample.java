import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store student details
        String name, course;
        int rollNo;

        // Accept student name
        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        // Accept roll number
        System.out.print("Enter student roll number: ");
        rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        // Accept course name
        System.out.print("Enter student course: ");
        course = scanner.nextLine();

        // Display the details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);

        // Close the scanner
        scanner.close();
    }
}
