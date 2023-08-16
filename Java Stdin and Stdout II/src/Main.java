import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        int integerInput = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Read a double
        double doubleInput = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        // Read a string
        String stringInput = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Print the outputs
        System.out.println("String: " + stringInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("Int: " + integerInput);
    }
}