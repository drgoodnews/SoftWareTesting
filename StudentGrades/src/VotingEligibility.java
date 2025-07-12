import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        if (age >= 18 && nationality.equalsIgnoreCase("Egyptian")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }

        scanner.close();
    }
}
