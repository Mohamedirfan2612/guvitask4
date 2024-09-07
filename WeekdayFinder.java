import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array to store weekday names starting with Sunday at index 0
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the day position (0-6): ");

        try {
            // Reading day index from user
            int dayIndex = obj.nextInt();

            // Printing the weekday based on user input
            System.out.println("The day is: " + weekdays[dayIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling case when index is outside the valid range 0-6
            System.out.println("Error: Invalid day position! Please enter a number between 0 and 6.");
        }

        }
    }
