
import java.util.Scanner;

public class Input_2type {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your sceond number: ");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println(sum);
        sc.close();

        
    }
    
}
