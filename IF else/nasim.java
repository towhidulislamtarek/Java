import java.util.Scanner;

public class nasim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();


        System.out.print("Enter your 2nd number: ");
        int t = sc.nextInt();

        if(t>n)
        {
            System.out.println("This is large number");
        }

       else if(n>t)
        {
            System.out.println("This is large number");

        }

        else
        {
            System.out.println("This is not valid");
        }

        sc.close();



    }
    
}
