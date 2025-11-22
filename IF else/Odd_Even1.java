import java.util.Scanner;

public class Odd_Even1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if(num %2 ==0)
        {
            System.out.println("This is Even number.");
        }

        else
        {
            System.out.println("This is Odd number.");
        }

        sc.close();
    }

    
}
