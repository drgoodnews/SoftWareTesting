import java.util.Scanner;

public class StudentGrades {

    public static double calculateAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public static String determineGrade(double average) {
        if (average >= 85) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\nStudent #" + i);

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter score 1: ");
            double score1 = scanner.nextDouble();

            System.out.print("Enter score 2: ");
            double score2 = scanner.nextDouble();

            System.out.print("Enter score 3: ");
            double score3 = scanner.nextDouble();
            scanner.nextLine();

            double average = calculateAverage(score1, score2, score3);

            String grade = determineGrade(average);

            System.out.println("\n--- Student Report ---");
            System.out.println("Name   : " + name);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Grade  : " + grade);
        }

        scanner.close();
    }
}
