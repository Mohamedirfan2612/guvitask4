//  progran to Custom Exception for invalid voter age
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

// Voter class
class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor with exception handling for age
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter.");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Method to display voter details
    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        // Test 1: Valid Voter
        try {
            Voter v1 = new Voter(1001, "Nick", 25);
            v1.display();
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Test 2: Valid Voter
        try {
            Voter v2 = new Voter(1002, "John", 22);
            v2.display();
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test 3: Invalid Voter with age less than 18
        try {
            Voter v3 = new Voter(1003, "Bob", 16);
            v3.display();
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // Test 3: Invalid Voter with age less than 18
        try {
            Voter v4 = new Voter(1004, "jay", 12);
            v4.display();
        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
