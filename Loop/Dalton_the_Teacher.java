package Loop;

import java.util.Scanner;

public class Dalton_the_Teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] seats = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            seats[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i == seats[i]) {
                count++;
            }
        }

        System.out.println((int) Math.ceil(count / 2.0)); 
        sc.close();
        
    }

    
}
