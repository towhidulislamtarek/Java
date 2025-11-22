public class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Student std1 = new Student("Abdullah", 100, 3.5);
        
        Student std2 = new Student("Rahim", 101, 3.8);

        std1.display();
        std2.display();
    }
}
