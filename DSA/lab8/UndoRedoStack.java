import java.util.LinkedList;
import java.util.Scanner;

public class UndoRedoStack {
    private LinkedList<String> stack;
    private LinkedList<String> tempStack;

    public UndoRedoStack() {
        stack = new LinkedList<>();
        tempStack = new LinkedList<>();
    }

    // Method to insert text
    public void insert(String text) {
        stack.push(text);
        tempStack.clear(); // Clear redo stack on new insert
    }

    // Method to undo the last operation
    public boolean undo() {
        if (!stack.isEmpty()) {
            String lastAction = stack.pop();
            tempStack.push(lastAction); // Push to redo stack
            return true;
        }
        return false;
    }

    // Method to redo the last undone operation
    public boolean redo() {
        if (!tempStack.isEmpty()) {
            String lastUndone = tempStack.pop();
            stack.push(lastUndone); // Push back to main stack
            return true;
        }
        return false;
    }

    // Method to display the current stack
// Method to display the current stack using a for loop
public void displayStack() {
    if (stack.isEmpty()) {
        System.out.println("Stack is Empty");
    } else {
        System.out.print("Current Stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println(); // Move to the next line after printing
    }
}


    public static void main(String[] args) {
        UndoRedoStack urStack = new UndoRedoStack();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please enter your choice: (1 for insert, 2 for undo, 3 for redo, 4 for display stack, 0 to exit)");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Input: ");
                    String input = scanner.nextLine();
                    urStack.insert(input);
                    break;
                case 2:
                    if (urStack.undo()) {
                        System.out.println("Undo successful");
                    } else {
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 3:
                    if (urStack.redo()) {
                        System.out.println("Redo successful");
                    } else {
                        System.out.println("Redo unsuccessful");
                    }
                    break;
                case 4:
                    urStack.displayStack();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}


