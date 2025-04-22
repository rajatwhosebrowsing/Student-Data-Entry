import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
    public static void addStudent(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter PRN: ");
            String prn = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Date of Birth (dd-mm-yyyy): ");
            String dob = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            if (marks < 0 || marks > 100)
                throw new InvalidStudentDataException("Marks should be between 0 and 100.");

            for (Student s : studentList) {
                if (s.prn.equals(prn))
                    throw new InvalidStudentDataException("Duplicate PRN.");
            }

            studentList.add(new Student(prn, name, dob, marks));
            System.out.println("Student added successfully.");
        } catch (InvalidStudentDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
