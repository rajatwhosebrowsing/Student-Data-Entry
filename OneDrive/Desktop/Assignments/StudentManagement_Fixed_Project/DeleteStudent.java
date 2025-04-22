import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent {
    public static void deleteStudent(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter PRN to delete: ");
            String prn = sc.nextLine();
            boolean removed = studentList.removeIf(s -> s.prn.equals(prn));
            if (!removed)
                throw new StudentNotFoundException("PRN not found.");
            else
                System.out.println("Student deleted.");
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
