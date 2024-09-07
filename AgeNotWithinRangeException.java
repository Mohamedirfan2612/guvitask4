//program to Custom Exception for invalid age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor with exception handling
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21).");
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Helper method to validate name
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+"); // Only letters and spaces allowed
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        try {
            // Creating valid student object
            Student s1 = new Student(101, "Ramesh kumar", 18, "Java Full Stack");
            s1.display();
            // Creating valid student object
            Student s2 =new Student(102, "Danny", 20, "Java Full Stack");
            s2.display();
            // Creating student object with invalid age
            Student s3 = new Student(103, "John", 22, "Python Full Stack");
            s3.display();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Creating student object with invalid name
            Student s4 = new Student(104, "Ram@26", 20, "Python Full Stack");
            s4.display();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


