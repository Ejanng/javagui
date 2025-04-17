import java.util.Scanner;

class Student {
    String name;
    int numSubjects;
    float[] scores;
    float average;

    // Constructor
    Student(String name, int numSubjects) {
        this.name = name;
        this.numSubjects = numSubjects;
        this.scores = new float[numSubjects];
    }

    // Calculate average score
    void calculateAverage() {
        float sum = 0;
        for (float score : scores) {
            sum += score;
        }
        average = sum / numSubjects;
    }

    // Display student report
    void displayReport() {
        System.out.println("------------------------------");
        System.out.println("Student: " + name);
        System.out.println("Subjects Taken: " + numSubjects);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("------------------------------");
    }
}

public class GradeAssessment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        // Get student details
        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();

            students[i] = new Student(name, numSubjects);
            
            System.out.println("Enter scores for each subject:");
            for (int j = 0; j < numSubjects; j++) {
                students[i].scores[j] = scanner.nextFloat();
            }
            scanner.nextLine(); // Consume newline

            students[i].calculateAverage();
        }

        // Display reports
        System.out.println("\n==============================");
        System.out.println("   Grade Assessment Report");
        System.out.println("==============================");
        for (Student student : students) {
            student.displayReport();
        }

        scanner.close();
    }
}
