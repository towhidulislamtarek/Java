import java.lang.Math;

public class MaxMinExample {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 67;
        int num3 = 34;

        int maxVal = Math.max(num1, Math.max(num2, num3));
        
        int minVal = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum value: " + maxVal);
        System.out.println("Minimum value: " + minVal);
    }
}

//Find the maximum and minimum values from three numbers using MATH Class