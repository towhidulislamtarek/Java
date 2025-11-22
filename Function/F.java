
import java.util.Scanner;

public class F {

    public static int calculateSum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);

        System.out.println("The sum of the two numbers is: " + sum);

        sc.close();
    }
}
