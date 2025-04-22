import java.util.ArrayList;

public class DisplayStudents {
    public static void displayStudents(ArrayList<Student> studentList) {
        if (studentList.isEmpty())
            System.out.println("No students to display.");
        else
            for (Student s : studentList)
                s.display();
    }
}
