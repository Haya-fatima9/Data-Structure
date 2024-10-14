import java.util.Scanner;
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number : " );
        int num =scanner.nextInt();
        String binary = decToBinary(num);
        System.out.println("The binary equivalent of " + num + " is: " + binary);
    }

    public static String decToBinary(int num) {
        // Base case: if the number is 0
        if (num == 0) {
            return "";  // Return an empty string for 0
        } else {
            // Recursive call
            return decToBinary(num / 2) + (num % 2);
        }
    }
}

