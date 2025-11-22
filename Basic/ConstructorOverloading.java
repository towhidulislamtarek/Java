public class ConstructorOverloading {

    private int height;
    private int width;  

    public ConstructorOverloading() {
        this.height = 10;
        this.width = 15;
    }

    public ConstructorOverloading(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        ConstructorOverloading b1 = new ConstructorOverloading();
        ConstructorOverloading b2 = new ConstructorOverloading(20, 30);
        ConstructorOverloading b3 = new ConstructorOverloading(50, 60);
        ConstructorOverloading b4 = new ConstructorOverloading();

        System.out.println("For Box-1 Height = " + b1.height + ", Width = " + b1.width);
        System.out.println("For Box-2 Height = " + b2.height + ", Width = " + b2.width);
        System.out.println("For Box-3 Height = " + b3.height + ", Width = " + b3.width);
        System.out.println("For Box-4 Height = " + b4.height + ", Width = " + b4.width);
    }
}
