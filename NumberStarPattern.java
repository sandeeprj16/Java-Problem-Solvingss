import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        int i = 1;
        boolean isNumber = true; // To switch between numbers and stars

        while (i <= n) {
            for (int count = 0; count < 5 && i <= n; count++, i++) {
                System.out.print(isNumber ? i + " " : "* ");
            }
            isNumber = !isNumber; // Toggle between numbers and stars
        }

        //scanner.close();
    }
}
