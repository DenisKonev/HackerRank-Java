import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();
        scanner.close();

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
    }
}