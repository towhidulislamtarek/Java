// Student.java

class Student {

    // Instance Variables
    private int id;
    private String name;
    private int grade;
    private String major;

    // Constructor
    public Student(int id, String name, int grade, String major) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    // Getter and Setter methods
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGrade(int grade) { this.grade = grade; }
    public void setMajor(String major) { this.major = major; }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getGrade() { return grade; }
    public String getMajor() { return major; }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create and display a student
        Student student = new Student(1, "Alice", 90, "Computer Science");

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Major: " + student.getMajor());
    }
}
