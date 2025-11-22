import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("5 Random Numbers between 100 and 200:");
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(101) + 100;
            System.out.println(randomNum);
        }
    }
}
// Generate 5 random numbers between 100 and 200.
