package collegtor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Student_information {
    String name;
    int age;
    String grade;
    public Student_information(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;       
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }
    public static void main(String[] args) {
         ArrayList<Student_information> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice,n;
         do {
            System.out.println("===========Menu==========");
            System.out.println("1) Add");
            System.out.println("2) View");
            System.out.println("3) Search");
            System.out.println("4) Update");
            System.out.println("5) Remove");
            System.out.println("6) Sort");
            System.out.println("7) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Input number: "); n=scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter student name: ");
                        String name = scanner.next();
                        System.out.print("Enter student age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter student grade: ");
                        String grade = scanner.next();
                        students.add(new Student_information(name, age, grade));
                    }
                    break;
                case 2:
                    for (Student_information student : students) {
                        System.out.println("Name: " + student.getName());
                        System.out.println("Age: " + student.getAge());
                        System.out.println("Grade: " + student.getGrade());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (Student_information student : students) {
                        if (student.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Name: " + student.getName());
                            System.out.println("Age: " + student.getAge());
                            System.out.println("Grade: " + student.getGrade());
                            System.out.println();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to update: ");
                    String updateName = scanner.next();
                    boolean updated = false;
                    for (Student_information student : students) {
                        if (student.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter updated age: ");
                            student.age = scanner.nextInt();
                            System.out.print("Enter updated grade: ");
                            student.grade = scanner.next();
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Student updated successfully.");
                    }
                    break;
                case 5:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.next();
                    boolean removed = false;
                    for (Student_information student : students) {
                        if (student.getName().equalsIgnoreCase(removeName)) {
                            students.remove(student);
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.println("Student removed successfully.");
                    }
                    break;
                case 6:
                    Collections.sort(students, (s1, s2) -> s1.getGrade().compareToIgnoreCase(s2.getGrade()));
                    System.out.println("Students sorted by grade:");
                    for (Student_information student : students) {
                        System.out.println("Name: " + student.getName());
                        System.out.println("Age: " + student.getAge());
                        System.out.println("Grade: " + student.getGrade());
                        System.out.println();
                    }
                    break;
            }
        } while (choice != 7);

        System.out.println("Exiting the program...");
    }
    
}
