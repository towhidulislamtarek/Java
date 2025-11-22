
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your Button number: ");
        int Button = sc.nextInt();

        switch(Button)
        {
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Assalamu alaykum");
            break;

            case 3: System.out.println("Bonjour");
            break;

            default: System.out.println("Invalied Button");

        }

        sc.close();
        
    }
    
}
