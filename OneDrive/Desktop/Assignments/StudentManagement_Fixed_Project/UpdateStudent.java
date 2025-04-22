import java.util.ArrayList;
import java.util.Scanner;

public class UpdateStudent {
    public static void updateStudent(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter PRN to update: ");
            String prn = sc.nextLine();
            boolean found = false;
            for (Student s : studentList) {
                if (s.prn.equals(prn)) {
                    System.out.print("Enter new name: ");
                    s.name = sc.nextLine();
                    System.out.print("Enter new DOB: ");
                    s.dob = sc.nextLine();
                    System.out.print("Enter new marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine();
                    if (marks < 0 || marks > 100)
                        throw new InvalidStudentDataException("Invalid marks.");
                    s.marks = marks;
                    System.out.println("Student updated.");
                    found = true;
                    break;
                }
            }
            if (!found)
                throw new StudentNotFoundException("PRN not found.");
        } catch (StudentNotFoundException | InvalidStudentDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
