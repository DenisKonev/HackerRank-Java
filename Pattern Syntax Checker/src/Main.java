import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        ArrayList<String> inputList = new ArrayList<>();

        while (testCases > 0){
            inputList.add(in.nextLine());
            testCases--;
        }

        for (String input : inputList)
            System.out.println(testPattern(input) ? "Valid" : "Invalid");
    }
    private static boolean testPattern(String pattern) {
        boolean valid = true;

        try {
            Pattern.compile(pattern);
        }
        catch (Exception e) {
            valid = false;
        }

        return valid;
    }
}



