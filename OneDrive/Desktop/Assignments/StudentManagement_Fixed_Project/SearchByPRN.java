import java.util.ArrayList;
import java.util.Scanner;

public class SearchByPRN {
    public static void searchByPRN(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter PRN to search: ");
            String prn = sc.nextLine();
            boolean found = false;
            for (Student s : studentList) {
                if (s.prn.equals(prn)) {
                    s.display();
                    found = true;
                    break;
                }
            }
            if (!found)
                throw new StudentNotFoundException("PRN not found.");
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
