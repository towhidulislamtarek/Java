import java.lang.Math;

public class MathOperations {
    public static void main(String[] args) {
        double number = -25.7;

        double absoluteValue = Math.abs(number);
        
        double floorValue = Math.floor(number);
        
        double ceilValue = Math.ceil(number);
        
        long roundedValue = Math.round(number);
        
        double sqrtValue = Math.sqrt(Math.abs(number));
        
        System.out.println("Absolute value: " + absoluteValue);
        System.out.println("Floor value: " + floorValue);
        System.out.println("Ceil value: " + ceilValue);
        System.out.println("Rounded value: " + roundedValue);
        System.out.println("Square root value: " + sqrtValue);
    }
}