class Present {

    String name;
    int age;

    
    Present(String name, int age) {
        this.name = name; // object name setup
        this.age = age; // Object age setup
    }

   
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Present person1 = new Present("Alice", 25);
        Present person2 = new Present("Bob", 30);

        person1.display();
        person2.display();
    }
}
