class Student {
    private String name;

    public Student(String name) {
        // Use "this" to refer to the instance variable
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    // Remove the parameter from the getname method
    public String getname() {
        return name;
    }
}

public class name {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Tom");
        Student s2 = new Student("Som");
        Student s3 = new Student(null);

        // Call getname method and print the names
        System.out.println("Student 1 Name: " + s1.getname());
        System.out.println("Student 2 Name: " + s2.getname());
        System.out.println("Student 3 Name: " + s3.getname());
    }
}
