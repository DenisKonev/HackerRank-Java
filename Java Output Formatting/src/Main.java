import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        String[] secondLine = scanner.nextLine().split(" ");
        String[] thirdLine = scanner.nextLine().split(" ");

        scanner.close();

        System.out.println("================================");
        System.out.println(String.format("%-15s", firstLine[0]) + String.format("%03d", Integer.parseInt(firstLine[1])));
        System.out.println(String.format("%-15s", secondLine[0]) + String.format("%03d", Integer.parseInt(secondLine[1])));
        System.out.println(String.format("%-15s", thirdLine[0]) + String.format("%03d", Integer.parseInt(thirdLine[1])));
        System.out.println("================================");
    }
}
