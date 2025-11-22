import java.util.Scanner;

public class Add_Two_Number {

    public static void main(String[] args) {
        
        Scanner nc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int number1 = nc.nextInt();

        System.out.print("Enter your 2nd number: ");
        int number2 = nc.nextInt();

        int sum = number1 + number2;

        System.out.println("This is sum of number is: "+sum);

        nc.close();


    }
    
}
