import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        if (isIntWierd(N))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }

    private static boolean isIntWierd(int number) {
        if (number % 2 != 0)
            return true;
        else
            return number >= 6 && number <= 20;
    }
}