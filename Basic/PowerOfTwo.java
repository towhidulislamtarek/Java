import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Powers of 2 from 2^0 to 2^" + n + ":");
        
        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }

        scanner.close();
    }
}
// Calculate 2^0 to 2^n Using Math Class. ‘n’ will be input from user