import java.util.ArrayList;
import java.util.Scanner;

public class SearchByName {
    public static void searchByName(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Name to search: ");
            String name = sc.nextLine();
            boolean found = false;
            for (Student s : studentList) {
                if (s.name.equalsIgnoreCase(name)) {
                    s.display();
                    found = true;
                }
            }
            if (!found)
                throw new StudentNotFoundException("Name not found.");
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
