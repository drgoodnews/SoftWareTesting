import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade (A, B, C, D, F): ");
        String input = scanner.nextLine();

        char grade = Character.toLowerCase(input.toLowerCase().charAt(0));

        switch (grade) {
            case 'a':
                System.out.println("Excellent");
                break;
            case 'b':
                System.out.println("Very Good");
                break;
            case 'c':
                System.out.println("Good");
                break;
            case 'd':
                System.out.println("Pass");
                break;
            case 'f':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

        scanner.close();
    }
}
