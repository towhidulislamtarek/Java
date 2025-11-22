
import java.util.Scanner;

public class Long_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a_number = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b_number = sc.nextInt();

        if(a_number > b_number)
        {
            System.out.println("A is Best number");
        }

        if(a_number <b_number)

        {
            System.out.println("B is the Best number");

        }

        if(a_number == b_number)
        {
            System.out.println("This is equal number");
        }
        sc.close();
    }
    
}
