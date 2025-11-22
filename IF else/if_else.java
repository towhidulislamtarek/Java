
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int a = sc.nextInt();

        System.out.print("Enter your scend number: ");
        int b = sc.nextInt();

        if(a ==b)
        {
            System.out.println("This is equal");
        }

        else if(a>b)
        {
            System.out.println("This is grater");
        }

        else
        {
            System.out.println("B is lassed");
        }

        sc.close();
    }
    
}
