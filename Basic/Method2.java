public class Method2 {
    public static void main(String[] args) {
        Method2 obj = new Method2(); 

        int a = 10;
        int b = 15;
        obj.sum(a, b); 
    }
    
    public void sum(int a, int b) {  
        System.out.println("The sum is: " + (a + b)); 
    }
}
