package Loop;

import java.util.LinkedList;
import java.util.Scanner;

public class Social_Network_Easy {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        LinkedList<Integer> conversations = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int friendId = scanner.nextInt();

            if (conversations.contains(friendId)) {
                continue;
            }

            if (conversations.size() == k) {
                conversations.removeLast();
            }

            conversations.addFirst(friendId);
        }

        scanner.close(); // Close the scanner resource

        System.out.println(conversations.size());
        
        // Print conversation list as a single line
        for (int i = 0; i < conversations.size(); i++) {
            System.out.print(conversations.get(i));
            if (i < conversations.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Move to a new line
    }
}
