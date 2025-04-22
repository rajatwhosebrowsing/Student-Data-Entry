/*
Name: Rajat
PRN: 1234567890
Batch: AIML B2
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> AddStudent.addStudent(studentList);
                case 2 -> DisplayStudents.displayStudents(studentList);
                case 3 -> SearchByPRN.searchByPRN(studentList);
                case 4 -> SearchByName.searchByName(studentList);
                case 5 -> SearchByPosition.searchByPosition(studentList);
                case 6 -> UpdateStudent.updateStudent(studentList);
                case 7 -> DeleteStudent.deleteStudent(studentList);
                case 8 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 8);
    }
}
