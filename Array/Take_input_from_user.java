package Array;

 import java.util. Scanner;

public class Take_input_from_user {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your array size:");

        int size = input.nextInt();

        int[]arr = new int[size];


        System.out.println("Enter value is ");

        for(int i = 0; i<size; i++)
        {
            arr[i]= input.nextInt();
        }

        for(int i = 0; i<size; i++)
        {
            System.out.println("The arry value is: "+arr[i]);
        }

        input.close();
    }
    
}
