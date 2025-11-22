import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the palindromic pattern: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) { // Loop for rows
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
