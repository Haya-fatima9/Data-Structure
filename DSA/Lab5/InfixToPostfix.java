import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    
    // Function to determine the precedence of operators
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    // Function to convert infix to postfix
    public static String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            // If the character is an operand (A-Z or a-z), add it to postfix
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } 
            // If the character is '(', push it to the stack
            else if (ch == '(') {
                stack.push(ch);
            } 
            // If the character is ')', pop from stack to postfix until '(' is found
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '(' from the stack
            } 
            // If the character is an operator
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch); // Push the current operator onto the stack
            }
        }

        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String userInput = scanner.nextLine();
        
        String postfixExpression = infixToPostfix(userInput.replaceAll(" ", ""));
        System.out.println("Postfix expression: " + postfixExpression);
        
        scanner.close();
    }
}
