public class Max {

    public static void main(String[] args) {
        int a = 11;
        int b = 8;
        int c = max(a, b); 
        System.out.println("Maximum Value: " + c);
    }

    public static int max(int a, int b) { 

        int max_value; 

        if (a > b) {
            max_value = a;
        } else {
            max_value = b;
        }

        return max_value; 
    }
}
