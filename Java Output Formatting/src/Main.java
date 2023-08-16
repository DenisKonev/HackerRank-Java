import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
        String[] thirdArray = scanner.nextLine().split(" ");

        scanner.close();

        System.out.println("================================");
        System.out.println(String.format("%-15s", firstArray[0]) + String.format("%03d", Integer.parseInt(firstArray[1])));
        System.out.println(String.format("%-15s", secondArray[0]) + String.format("%03d", Integer.parseInt(secondArray[1])));
        System.out.println(String.format("%-15s", thirdArray[0]) + String.format("%03d", Integer.parseInt(thirdArray[1])));
        System.out.println("================================");
    }
}
