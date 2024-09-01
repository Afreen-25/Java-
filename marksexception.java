import java.util.Scanner;

// Custom Exception class for Marks Out of Bounds
class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

// Result class representing the student's result
class Result {
    private String name;
    private String seatNo;
    private String date;
    private int centerNumber;
    private int marks;

    // Constructor to initialize result details
    public Result(String name, String seatNo, String date, int centerNumber) {
        this.name = name;
        this.seatNo = seatNo;
        this.date = date;
        this.centerNumber = centerNumber;
    }

    // Method to set marks and handle MarksOutOfBoundsException
    public void setMarks(int marks) throws MarksOutOfBoundsException {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfBoundsException("Marks should be between 0 and 100");
        }
        this.marks = marks;
    }


    // Method to display result details
    public void displayResult() {
        System.out.println("Result:");
        System.out.println("Name: " + name);
        System.out.println("Seat No: " + seatNo);
        System.out.println("Date: " + date);
        System.out.println("Center Number: " + centerNumber);
        System.out.println("Marks: " + marks);
    }
}

public class marksexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Seat No: ");
        String seatNo = scanner.nextLine();
        System.out.print("Enter Date: ");
        String date = scanner.nextLine();
        System.out.print("Enter Center Number: ");
        int centerNumber = scanner.nextInt();

        // Create Result object
        Result result = new Result(name, seatNo, date, centerNumber);

        // Input and set marks
        try {
            System.out.print("Enter Marks for Semester Three Exam: ");
            int marks = scanner.nextInt();
            result.setMarks(marks);

            // Display result
            result.displayResult();
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
 
}
