package twoD_Arry;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Rows number: ");
        int rows = sc.nextInt();

        System.out.print("Enter your Colume number: ");
        int cols = sc.nextInt();

        int [][] number = new int [rows][cols];

        for(int i = 0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                number[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(number[i][j]+" ");
            }

            System.out.println();
        }

        sc.close();
    }


    
}
