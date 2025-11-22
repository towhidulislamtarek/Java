import java.util.Scanner;

public class Revers_print {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        for(int i = n; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
