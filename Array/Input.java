package Array;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Size: ");
        int size = sc.nextInt();
        System.out.print("Enter your number: ");
        int numbers[]= new int[size];

        for(int i = 0; i<size; i++)
        {
            numbers[i]= sc.nextInt();
        }

        for(int i=0; i<size; i++)
        {
            System.out.println(numbers[i]);
        }

        sc.close();

    }
    
}
