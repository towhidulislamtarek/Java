
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int number = sc.nextInt();

        if(number % 2== 0)
        {
            System.out.println("This is Even number");
        }

        else
        {
            System.out.println("This id odd number");
        }

        sc.close();

    }
}

