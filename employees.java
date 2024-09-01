
class Person {
    private String name;

    // Constructor for Person class
    public Person(String name) {
        this.name = name;
    }

    // Accessor method to get the name
    public String getName() {
        return name;
    }

    // Equals method to check if two Person objects are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name);
    }

    // toString method to represent the Person object as a string
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

// Employee class derived from Person
class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    // Constructor for Employee class
    public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Accessor methods for Employee class
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Equals method to check if two Employee objects are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.annualSalary, annualSalary) == 0 &&
                startYear == employee.startYear &&
                nationalInsuranceNumber.equals(employee.nationalInsuranceNumber);
    }

    // toString method to represent the Employee object as a string
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", annualSalary=" + annualSalary +
                ", startYear=" + startYear +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                '}';
    }
}

// Test class
public class employees {
    public static void main(String[] args) {
        // Test the Person class
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        Person person3 = new Person("Jane");

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Person 3: " + person3);
        System.out.println("Person 1 equals Person 2: " + person1.equals(person2));
        System.out.println("Person 1 equals Person 3: " + person1.equals(person3));

        // Test the Employee class
        Employee employee1 = new Employee("Alice", 50000, 2020, "NI123456");
        Employee employee2 = new Employee("Alice", 50000, 2020, "NI123456");
        Employee employee3 = new Employee("Bob", 60000, 2019, "NI789012");

        System.out.println("\nEmployee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);
        System.out.println("Employee 3: " + employee3);
        System.out.println("Employee 1 equals Employee 2: " + employee1.equals(employee2));
        System.out.println("Employee 1 equals Employee 3: " + employee1.equals(employee3));
    }
}
