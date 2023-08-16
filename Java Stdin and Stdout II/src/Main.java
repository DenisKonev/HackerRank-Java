import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        String myString = scanner.next();
        myString += scanner.nextLine();

        System.out.format("String: %s%n", myString);
        System.out.println("Double: " + myDouble);
        System.out.format("Int: %d", myInt);
    }
}