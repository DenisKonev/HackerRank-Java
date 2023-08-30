import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(input.substring(start, end));
    }
}