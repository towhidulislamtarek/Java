
import java.util.Scanner;

public class Grateer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();

        System.out.print("Enter your scound number: ");
        int b = sc.nextInt();

        if(a ==b )
        {
            System.out.println("Equal");
        }

        else
        {
            if(a>b)
            {
                System.out.println("A is the grater");
            }

            else
            {
                System.out.println("A is lesset");

            }
        }
        
        sc.close();
    }   
}
