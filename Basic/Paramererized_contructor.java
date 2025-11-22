public class Paramererized_contructor {

    int x;

    public Paramererized_contructor(int y)
    {
        x = y;
    }

    public static void main(String[] args) {
        Paramererized_contructor myobj = new Paramererized_contructor(50);
        System.out.println(myobj.x); 
    }
    
}
