import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    static Exception exception;
    static {exception = new Exception("java.lang.Exception: Breadth and height must be positive");}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.close();

        System.out.println(Main.calculateArea(breadth, height));
    }

    private static String calculateArea(int breadth, int height) {
        try {
            if (breadth <= 0 || height <= 0 )
                throw exception;
            else
                return String.valueOf(breadth * height);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}