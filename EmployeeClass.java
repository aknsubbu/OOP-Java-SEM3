public class EmployeeClass {
    // Data members
    private String name;
    private String address;
    private int age;
    private String gender;

    // Constructor
    public EmployeeClass(String name, String address, int age, String gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        // Create an Employee object
        EmployeeClass employee = new EmployeeClass("John Doe", "123 Main St", 30, "Male");

        // Display employee details
        employee.display();
    }
}
