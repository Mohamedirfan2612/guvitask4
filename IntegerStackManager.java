
import java.util.Stack;

public class IntegerStackManager {
    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStackManager() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty! Cannot pop elements.");
        } else {
            int poppedElement = stack.pop();
            System.out.println("Popped " + poppedElement + " from the stack.");
        }
    }

    // Method to check if the stack is empty
    public void isStackEmpty() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        IntegerStackManager stackManager = new IntegerStackManager();

        // Test pushing elements onto the stack
        stackManager.pushElement(10);
        stackManager.pushElement(20);
        stackManager.pushElement(30);

        // Test checking if the stack is empty
        stackManager.isStackEmpty();

        // Test popping elements from the stack
        stackManager.popElement();
        stackManager.popElement();

        // Test popping from an empty stack
        stackManager.popElement();
        stackManager.popElement(); // This will show an error message

        // Test checking if the stack is empty again
        stackManager.isStackEmpty();
    }
}
