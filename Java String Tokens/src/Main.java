import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        splitTokens(input);
    }

    private static void splitTokens(String input) {
        //replace all "!" ",""?" "." "_" "'" "@" with spaces. also shrink all double & triple spaces to singular ones
        input = input.strip().replaceAll("!", " ").replaceAll(",", " ").replaceAll("\\?", " ").replaceAll("\\.", " ")
                .replaceAll("_", " ").replaceAll("'", " ").replaceAll("@", " ").replaceAll(" +", " ");

        if (input.isEmpty()) {
            System.out.println("0");
            return;
        }

        String[] result =  input.split(" ");
        System.out.println(result.length);
        for (String output: result)
            System.out.println(output);
    }
}

