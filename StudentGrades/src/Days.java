import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 10 and Even/Odd:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        System.out.println("\nDay names using switch:");
        for (int day = 1; day <= 7; day++) {
            System.out.print("Day " + day + " is: ");
            switch (day) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
        }

        System.out.println("\nMultiplication Table (1 to 10):");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %3d   ", i, j, i * j);
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a number to count its digits: ");
        int num = scanner.nextInt();
        int count = 0;
        int temp = num;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }
        System.out.println("Number of digits in " + num + " = " + count);

        System.out.print("\nEnter a number to reverse: ");
        int numberToReverse = scanner.nextInt();
        int reversed = 0;
        int original = numberToReverse;
        while (numberToReverse != 0) {
            int digit = numberToReverse % 10;
            reversed = reversed * 10 + digit;
            numberToReverse /= 10;
        }
        System.out.println("Reversed number of " + original + " = " + reversed);

        scanner.close();
    }
}
