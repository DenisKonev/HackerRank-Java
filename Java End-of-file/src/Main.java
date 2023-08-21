import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while(scanner.hasNext())
        {
            String input = scanner.nextLine();
            System.out.println(i + " " + input);
            i++;
        }
    }
}
