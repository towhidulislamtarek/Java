public class Parameterized_construector1 {
    int height;
    int width;

   public Parameterized_construector1(int a, int b)
   {
    System.out.println("\n Box Created.");
    this.height = a;
    this.width = b;

   }

   public static void main(String[] args) {
    Parameterized_construector1 Box1 = new Parameterized_construector1(10, 20);

    System.out.println("The height of box1 = " +Box1.height);
    
   }
}
