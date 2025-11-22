public class Student_Information {
    private String id;
    private String name;
    private double cgpa;

    public void insert_Record(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display_Record() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student_Information st1 = new Student_Information(); 
        st1.insert_Record("121-15-555", "Johan", 3.9);
        st1.display_Record();
    }
}
