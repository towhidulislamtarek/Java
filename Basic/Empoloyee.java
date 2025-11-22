public class Empoloyee {

    int empId;
    String empName;

    Empoloyee(int id, String name){
        this.empId = id;
        this.empName = name;
    }

    void info()
    {
        System.out.println("ID: "+empId+ "Name:"+empName);
    }

    public static void main(String[] args) {
        Empoloyee obj1 = new Empoloyee(1025,"haitanya");
        Empoloyee obj2 = new Empoloyee(92234, "Nagan");

        obj1.info();
        obj2.info();
    }
}
