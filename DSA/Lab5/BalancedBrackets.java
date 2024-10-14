import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Use a simple for loop to iterate through the string
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            // Push opening brackets onto the stack
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            // Check for closing brackets
            else if (ch == '}' || ch == ']' || ch == ')') {
                // If stack is empty or top of stack doesn't match, it's unbalanced
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == '}' && top != '{') || 
                    (ch == ']' && top != '[') || 
                    (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        // If the stack is empty, all brackets were balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with brackets: ");
        String userInput = scanner.nextLine();
        
        if (isBalanced(userInput)) {
            System.out.println("The brackets are balanced.");
        } else {
            System.out.println("The brackets are not balanced.");
        }
        
        scanner.close();
    }
}
 