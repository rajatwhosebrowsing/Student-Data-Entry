import java.util.ArrayList;
import java.util.Scanner;

public class SearchByPosition {
    public static void searchByPosition(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter position (0-based): ");
            int pos = sc.nextInt();
            sc.nextLine();
            if (pos < 0 || pos >= studentList.size())
                throw new StudentNotFoundException("Invalid position.");
            studentList.get(pos).display();
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
